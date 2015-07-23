/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:03:35 AM
 */
package com.tamil.dp.strategy.behaviorimpl.flyingimpls;

import com.tamil.dp.strategy.behaviorInterfaces.FlyingBehavior;

/**
 * @author Murugan_Nagarajan
 *
 */
public class FlyWithDesignedWings implements FlyingBehavior {

	/* (non-Javadoc)
	 * @see com.tamil.dp.strategy.behaviorInterfaces.FlyingBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I can fly with some external support/means.");		
	}
	
}
