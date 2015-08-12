/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 27, 2015
 * @time	: 3:06:51 PM
 */
package com.tamil.dp.decorator.decoratorscomponents;

import com.tamil.dp.decorator.abstractcomponent.Beverage;
import com.tamil.dp.decorator.abstractcomponent.SizeDecorator;

/**
 * @author Murugan_Nagarajan
 *
 */
public class Tall extends SizeDecorator {
	Beverage beverage;
	
	
	/* (non-Javadoc)
	 * @see com.tamil.dp.decorator.abstractcomponents.FlavorDecorator#getDescription()
	 */
	public Tall(Beverage bev) {
		this.beverage = bev;
	}

	@Override
	public String getDescription() {
		return "Tall - "+beverage.getDescription();
	}

	/* (non-Javadoc)
	 * @see com.tamil.dp.decorator.abstractcomponents.Beverage#cost()
	 */
	@Override
	public double cost() {
		return  1.5 * beverage.cost();
	}
}
