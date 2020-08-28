package com.citi.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citi.test.model.CityWeatherInfo;
import com.citi.test.service.MetaWeatherService;

@RestController
public class RestWeatherController {
	
	@Autowired
	private MetaWeatherService metaWeatherService;
	
	/*
	 * Parameter approach, @RequestParam does the work enough for error handling in case the parameter comes empty 
	 */
	@GetMapping(path = "/weather")
	public ResponseEntity<List<CityWeatherInfo>> getWeather(@RequestParam(value = "city") String city) { 
		return metaWeatherService.getCityWeatherInfo(city);
	}
}
