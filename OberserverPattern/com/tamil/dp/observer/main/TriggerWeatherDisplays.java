/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 25, 2015
 * @time	: 5:29:09 PM
 */
package com.tamil.dp.observer.main;

import com.tamil.dp.observer.displayImpls.CurrentWeather;
import com.tamil.dp.observer.displayImpls.ForecastWeather;
import com.tamil.dp.observer.displayImpls.StatisticsWeather;
import com.tamil.dp.observer.source.ObservableWeatherObj;

/**
 * @author Murugan_Nagarajan
 *
 */
public class TriggerWeatherDisplays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObservableWeatherObj weatherSource = new ObservableWeatherObj();
		
		new CurrentWeather(weatherSource);
		new StatisticsWeather(weatherSource);
		new ForecastWeather(weatherSource);
		
		weatherSource.parametersChanged(92.0f, 67, 30.5f);
		weatherSource.parametersChanged(90.0f, 70, 29.3f);
		weatherSource.parametersChanged(92.0f, 34, 25.4f);
		weatherSource.parametersChanged(92.0f, 85, 31.6f);
		
	}

}
