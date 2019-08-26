package com.emr.head_first.design_patterns.unit_2_observer_pattern;

import com.emr.head_first.design_patterns.unit_2_observer_pattern.displays.WeatherDataObserver;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WeatherData extends Observable<WeatherDataObserver>{
	
	float temprature;
	float humidity;
	float preasure;
	float heatIndex;

	public WeatherData() {
		super();
	}
	
	public void setMeasurements(float temprature,float humidity,float preasure,float heatIndex) {
		this.temprature=temprature;
		this.humidity=humidity;
		this.preasure=preasure;
		this.heatIndex=heatIndex;
		measurementsChanged();
	}

	@Override
	void update() {
		if (isChanged) {
			for (WeatherDataObserver weatherDataObserver : observers) {
				weatherDataObserver.update(this);
			}
		}
	}
	
}
