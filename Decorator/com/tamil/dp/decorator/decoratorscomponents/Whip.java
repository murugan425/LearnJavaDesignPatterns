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
public class Whip extends FlavorDecorator {
	
	Beverage beverage;
	
	
	/* (non-Javadoc)
	 * @see com.tamil.dp.decorator.abstractcomponents.FlavorDecorator#getDescription()
	 */
	public Whip(Beverage bev) {
		this.beverage = bev;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	/* (non-Javadoc)
	 * @see com.tamil.dp.decorator.abstractcomponents.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 10 + beverage.cost();
	}

}
