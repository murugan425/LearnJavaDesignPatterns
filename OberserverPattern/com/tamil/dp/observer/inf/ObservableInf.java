/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 25, 2015
 * @time	: 2:55:29 PM
 */
package com.tamil.dp.observer.inf;


/**
 * @author Murugan_Nagarajan
 *
 */
public interface ObservableInf {
	public void registerObserver(ObserverInf observerInf);
	public void dergisterObserver(ObserverInf observerInf);
	public void notifyObservers();	
}
