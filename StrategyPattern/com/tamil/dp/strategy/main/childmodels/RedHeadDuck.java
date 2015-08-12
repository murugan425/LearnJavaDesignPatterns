/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:29:33 AM
 */
package com.tamil.dp.strategy.main.childmodels;

import com.tamil.dp.strategy.main.behaviorimpl.flyingimpls.FlyWithWings;
import com.tamil.dp.strategy.main.behaviorimpl.quackimpls.QuackSound;
import com.tamil.dp.strategy.main.mainmodel.Duck;

/**
 * @author Murugan_Nagarajan
 *
 */
public class RedHeadDuck extends Duck {

	/**
	 * Here we are declaring the respective flying behavior of Red Head duck
	 * during instantiation or object initialization using the constructor.
	 */
	public RedHeadDuck() {
		flyBehave = new FlyWithWings();
		quackBehave = new QuackSound();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tamil.dp.strategy.mainmodel.Duck#displayDetail()
	 */
	@Override
	public void displayDetail() {
		System.out.println("I m a duck with Read Head");
	}

}
