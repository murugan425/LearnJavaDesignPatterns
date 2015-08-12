/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 25, 2015
 * @time	: 3:55:25 PM
 */
package com.tamil.dp.observer.displayImpls;

import com.tamil.dp.observer.displayInf.DisplayScreenInf;
import com.tamil.dp.observer.inf.ObserverInf;
import com.tamil.dp.observer.source.ObservableWeatherObj;

/**
 * @author Murugan_Nagarajan
 *
 */
public class CurrentWeather implements ObserverInf , DisplayScreenInf {
	private float currTemperature;
	private float currHumidity;
	@SuppressWarnings("unused")
	private ObservableWeatherObj weatherSource;
	
	
	public CurrentWeather(ObservableWeatherObj weatherSource) {
		this.weatherSource = weatherSource;
		weatherSource.registerObserver(this);
	}

	@Override
	public void refreshDisplayTerminal() {
		System.out.println("Current Climate Update - Temp: "+currTemperature+" ,Humidity: "+currHumidity);		
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.currTemperature = temperature;
		this.currHumidity = humidity;
		refreshDisplayTerminal();
	}
	
}
