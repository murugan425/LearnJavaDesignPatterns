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
public class Cappuccino extends Beverage {

	public Cappuccino() {
		description = "Cappuccino";
	}
	
	/* (non-Javadoc)
	 * @see com.tamil.dp.decorator.abstractcomponents.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 120;
	}
	
}
