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
public class ForecastWeather implements ObserverInf , DisplayScreenInf {
	private ObservableWeatherObj weatherSource;
	
	private static float currentPressure;
	private static float lastPressure;
	
	public ForecastWeather(ObservableWeatherObj weatherSource) {
		this.weatherSource = weatherSource;
		weatherSource.registerObserver(this);
	}

	@Override
	public void refreshDisplayTerminal() {
		System.out.print("Forecast :");
		if(currentPressure > lastPressure) {
			System.out.println("It going to be sunny soon..,");
		} else if(currentPressure == lastPressure) {
			System.out.println("Climate remains the same...");
		} else if (currentPressure < lastPressure) {
			System.out.println("Climate will be cooling down..,");
		}
		lastPressure = currentPressure;
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.currentPressure = pressure;
		refreshDisplayTerminal();
	}
}
