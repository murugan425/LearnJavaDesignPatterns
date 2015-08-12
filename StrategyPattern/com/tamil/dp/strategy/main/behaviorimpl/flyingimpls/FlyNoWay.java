/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:03:02 AM
 */
package com.tamil.dp.strategy.main.behaviorimpl.flyingimpls;

import com.tamil.dp.strategy.main.behaviorInterfaces.FlyingBehavior;

/**
 * @author Murugan_Nagarajan
 *
 */
public class FlyNoWay implements FlyingBehavior {

	/* (non-Javadoc)
	 * @see com.tamil.dp.strategy.behaviorInterfaces.FlyingBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I can't Fly.., Non-Living");
	}
	
}
