/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 27, 2015
 * @time	: 2:41:00 PM
 */
package com.tamil.dp.decorator.decoratorscomponents;

import com.tamil.dp.decorator.abstractcomponent.Beverage;
import com.tamil.dp.decorator.abstractcomponent.FlavorDecorator;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Milk extends FlavorDecorator {
	
	Beverage beverage;
	
	
	/* (non-Javadoc)
	 * @see com.tamil.dp.decorator.abstractcomponents.FlavorDecorator#getDescription()
	 */
	public Milk(Beverage bev) {
		this.beverage = bev;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	/* (non-Javadoc)
	 * @see com.tamil.dp.decorator.abstractcomponents.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 18 + beverage.cost();
	}

}
