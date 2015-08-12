/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:02:48 AM
 */
package com.tamil.dp.strategy.main.behaviorimpl.flyingimpls;

import com.tamil.dp.strategy.main.behaviorInterfaces.FlyingBehavior;

/**
 * @author Murugan_Nagarajan
 *
 */
public class FlyWithWings implements FlyingBehavior {

	/* (non-Javadoc)
	 * @see com.tamil.dp.strategy.behaviorInterfaces.FlyingBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I can fly with my own wings.");		
	}

}
