/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 27, 2015
 * @time	: 2:22:53 PM
 */
package com.tamil.dp.decorator.maincomponents;

import com.tamil.dp.decorator.abstractcomponent.Beverage;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Latte extends Beverage {

	public Latte() {
		description = "Latte";
	}
	
	/* (non-Javadoc)
	 * @see com.tamil.dp.decorator.abstractcomponents.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 60;
	}
	
}
