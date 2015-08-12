/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:04:18 AM
 */
package com.tamil.dp.strategy.main.behaviorimpl.quackimpls;

import com.tamil.dp.strategy.main.behaviorInterfaces.QuackBehavior;

/**
 * @author Murugan_Nagarajan
 *
 */
public class QuackSound implements QuackBehavior {

	/* (non-Javadoc)
	 * @see com.tamil.dp.strategy.behaviorInterfaces.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("Quack Quack Quack");
	}

}
