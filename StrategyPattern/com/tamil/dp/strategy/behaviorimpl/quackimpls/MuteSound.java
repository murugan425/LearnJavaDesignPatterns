/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:04:58 AM
 */
package com.tamil.dp.strategy.behaviorimpl.quackimpls;

import com.tamil.dp.strategy.behaviorInterfaces.QuackBehavior;

/**
 * @author Murugan_Nagarajan
 *
 */
public class MuteSound implements QuackBehavior {

	/* (non-Javadoc)
	 * @see com.tamil.dp.strategy.behaviorInterfaces.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		System.out.println("<<<< Silence >>>");		
	}

}
