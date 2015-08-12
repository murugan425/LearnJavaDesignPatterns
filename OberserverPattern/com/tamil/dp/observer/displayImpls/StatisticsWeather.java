/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 25, 2015
 * @time	: 4:22:44 PM
 */
package com.tamil.dp.observer.displayImpls;

import com.tamil.dp.observer.displayInf.DisplayScreenInf;
import com.tamil.dp.observer.inf.ObserverInf;
import com.tamil.dp.observer.source.ObservableWeatherObj;

/**
 * @author Murugan_Nagarajan
 *
 */
public class StatisticsWeather implements ObserverInf , DisplayScreenInf {
	
	private ObservableWeatherObj weatherSource;
	
	private float currTemperature = 0;
	private float minTemp = 500.0f;
	private float maxTemp = 0.0f;
	private float sumTemp = 0.0f;
	
	private int totalInputsArrived = 0;
	
	public StatisticsWeather(ObservableWeatherObj weatherSource) {
		this.weatherSource = weatherSource;
		weatherSource.registerObserver(this);
	}

	@Override
	public void refreshDisplayTerminal() {
		totalInputsArrived++;
		if(currTemperature > maxTemp) {
			maxTemp = currTemperature;
		}
		if(currTemperature < minTemp) {
			minTemp = currTemperature;
		}
		sumTemp += currTemperature;
		System.out.println("Avg Temp: +" +(sumTemp/totalInputsArrived) + " ,Minimum Temp: "+ minTemp+" ,Maximum Temp:"+ maxTemp);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.currTemperature = temperature;
		refreshDisplayTerminal();
	}
}
