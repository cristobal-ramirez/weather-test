package com.citi.test.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.citi.test.model.CityLocation;
import com.citi.test.model.CityWeather;
import com.citi.test.model.CityWeatherInfo;
import com.citi.test.model.ConsolidatedWeather;

@Service
public class MetaWeatherService {

	private static String RESOURCE_CITY_URL = "https://www.metaweather.com/api/location/search/?query=";

	private static String RESOURCE_WEATHER_URL = "https://www.metaweather.com/api/location/";

	private RestTemplate restTemplate;

	@Autowired
	public MetaWeatherService(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}

	/*
	 * method caller 
	 */
	public ResponseEntity<List<CityWeatherInfo>> getCityWeatherInfo(String city) {

		ResponseEntity<List<CityLocation>> responseEntity = searchCityLocations(city);

		List<CityWeatherInfo> cityWeatherInfo = processWeatherInfo(responseEntity.getBody());

		return new ResponseEntity<List<CityWeatherInfo>>(cityWeatherInfo, HttpStatus.OK);
	}

	/*
	 * client service, list all the cities that match the city value, for example 'SAN', or 'san', or SANTIAGO
	 */ 
	private ResponseEntity<List<CityLocation>> searchCityLocations(String city) {
		String cityURL = RESOURCE_CITY_URL + city;

		ResponseEntity<List<CityLocation>> responseEntity = restTemplate.exchange(cityURL, 
				HttpMethod.GET, null, new ParameterizedTypeReference<List<CityLocation>>() {});

		return responseEntity;
	}	
	
	/*
	 * process the list of cities, for each city it calls the weather service and populate the result list
	 */ 
	private List<CityWeatherInfo> processWeatherInfo(List<CityLocation> cityLocations) {
		List<CityWeatherInfo> citiesWeatherInfo = new ArrayList<>();

		for (CityLocation cityLocation : cityLocations) {
			ResponseEntity<CityWeather> cityWeather = getCityWeather(cityLocation);	

			citiesWeatherInfo.add(getCityWeatherInfo(cityWeather.getBody()));
		}

		return citiesWeatherInfo;
	}
	
	/*
	 * client service, get the weather information by WOEID
	 */
	private ResponseEntity<CityWeather> getCityWeather(CityLocation cityLocation) {
		String weatherURL = RESOURCE_WEATHER_URL + cityLocation.getWoeid();

		ResponseEntity<CityWeather> responseEntity = restTemplate.getForEntity(weatherURL, CityWeather.class);

		return responseEntity;
	}
	
	/*
	 * process weather info, instantiate the representation of the final result
	 */
	private CityWeatherInfo getCityWeatherInfo(CityWeather cityWeather) {
		//get the current weather, today is first position, next positions are forecast 
		ConsolidatedWeather currentConsolidatedWeather = cityWeather.getConsolidatedWeather().get(0);

		String celsiusTemp = getCelsiusTemp(currentConsolidatedWeather.getTheTemp());
		String fahrenheitTemp = convertCelsiusToFahrenheit(celsiusTemp);

		CityWeatherInfo cityWeatherInfo = new CityWeatherInfo();
		cityWeatherInfo.setCity(cityWeather.getTitle());
		cityWeatherInfo.setCelsiusTemp(celsiusTemp);
		cityWeatherInfo.setFahrenheitTemp(fahrenheitTemp);

		return cityWeatherInfo;
	}

	/*
	 * getting the integer part just to do the math clean for fahrenheit conversion
	 */
	private String getCelsiusTemp(Double theTemp) {
		BigDecimal celsiusTemp = new BigDecimal(theTemp);

		return String.valueOf(celsiusTemp.intValue());
	}

	private static final BigDecimal FACTOR18 = new BigDecimal("1.8");
	private static final BigDecimal FACTOR32 = new BigDecimal("32");

	/*
	 * convert Celsius scale to Fahrenheit scale
	 */
	private String convertCelsiusToFahrenheit(String celsiusTemp) {		
		BigDecimal fahrenheitTemp = new BigDecimal(celsiusTemp).multiply(FACTOR18).add(FACTOR32);

		return String.valueOf(fahrenheitTemp.intValue());
	}
}
