package com.citi.test.model;

public class CityWeatherInfo {
	private String city;
	private String celsiusTemp;
	private String fahrenheitTemp;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCelsiusTemp() {
		return celsiusTemp;
	}

	public void setCelsiusTemp(String celsiusTemp) {
		this.celsiusTemp = celsiusTemp;
	}

	public String getFahrenheitTemp() {
		return fahrenheitTemp;
	}

	public void setFahrenheitTemp(String fahrenheitTemp) {
		this.fahrenheitTemp = fahrenheitTemp;
	}
}
