/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 27, 2015
 * @time	: 2:14:49 PM
 */
package com.tamil.dp.decorator.abstractcomponent;

/**
 * @author Murugan_Nagarajan
 *
 */
public abstract class Beverage {
	
	protected String description = "Unknown description";
	
	public abstract double cost();

	public String getDescription() {
		return description;
	}
}
