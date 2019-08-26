package com.emr.head_first.design_patterns.unit_2_observer_pattern.displays;

import com.emr.head_first.design_patterns.unit_2_observer_pattern.WeatherData;

public class CurrentConditionsDisplay implements WeatherDataObserver,Display{

	float temp;
	float humidity;
	
	@Override
	public void update(WeatherData weatherData) {
		this.temp=weatherData.getTemprature();
		this.humidity=weatherData.getHumidity();
	}
	
	@Override
	public void display() {
		System.out.println("Temp is: "+temp+"\nHumidity is: "+humidity);
	}
}
