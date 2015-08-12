/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:29:48 AM
 */
package com.tamil.dp.strategy.main.childmodels;

import com.tamil.dp.strategy.main.behaviorimpl.flyingimpls.FlyNoWay;
import com.tamil.dp.strategy.main.behaviorimpl.quackimpls.SqueakSound;
import com.tamil.dp.strategy.main.mainmodel.Duck;

/**
 * @author Murugan_Nagarajan
 *
 */
public class RubberDuck extends Duck  {

	/**
	 * Here we are declaring the respective flying behavior of Red Head duck
	 * during instantiation or object initialization using the constructor.
	 */
	public RubberDuck() {
		flyBehave = new FlyNoWay();
		quackBehave = new SqueakSound();
	}

	
	/* (non-Javadoc)
	 * @see com.tamil.dp.strategy.mainmodel.Duck#displayDetail()
	 */
	@Override
	public void displayDetail() {
		System.out.println("I'm a rubber duck used as a toy.");		
	}

}
