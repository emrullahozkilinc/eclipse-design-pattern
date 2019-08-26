package com.emr.head_first.design_patterns.unit_2_observer_pattern.displays;

import com.emr.head_first.design_patterns.unit_2_observer_pattern.WeatherData;

public interface WeatherDataObserver {
	public void update(WeatherData weatherData);
}
