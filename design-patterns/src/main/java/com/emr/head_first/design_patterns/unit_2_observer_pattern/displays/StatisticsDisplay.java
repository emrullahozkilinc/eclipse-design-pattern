package com.emr.head_first.design_patterns.unit_2_observer_pattern.displays;

import com.emr.head_first.design_patterns.unit_2_observer_pattern.WeatherData;

public class StatisticsDisplay implements WeatherDataObserver,Display {

	float temp;
	float humidity;
	float preasure;
	
	@Override
	public void update(WeatherData weatherData) {
		this.temp=weatherData.getTemprature();
		this.humidity=weatherData.getHumidity();
		this.preasure=weatherData.getPreasure();
	}
	
	@Override
	public void display() {
		System.out.println("Temp is: "+temp+"\nHumidity is: "+humidity+"\nPreasure is: "+preasure);
	}
}
