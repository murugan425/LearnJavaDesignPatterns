/**
 * 
 */
package com.tamil.dp.observer.source;

import java.util.ArrayList;

import com.tamil.dp.observer.inf.ObservableInf;
import com.tamil.dp.observer.inf.ObserverInf;

/**
 * @author Murugan_Nagarajan
 *
 */
public class ObservableWeatherObj implements ObservableInf {
	
	private ArrayList<ObserverInf> observerList;
		
	public ObservableWeatherObj() {
		observerList = new ArrayList<ObserverInf>();
	}

	private float temperature;
	private float humidity;
	private float pressure;

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	@Override
	public void registerObserver(ObserverInf observerInf) {
		observerList.add(observerInf);	
	}

	@Override
	public void dergisterObserver(ObserverInf observerInf) {
		observerList.remove(observerInf);
	}

	@Override
	public void notifyObservers() {
		for (ObserverInf observerInf : observerList) {
			observerInf.update(temperature, humidity, pressure);
		}	
		System.out.println("====================================");
	}
	
	public void parametersChanged(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
}
