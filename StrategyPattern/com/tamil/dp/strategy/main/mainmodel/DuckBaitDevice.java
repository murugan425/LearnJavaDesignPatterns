/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:13:47 AM
 */
package com.tamil.dp.strategy.main.mainmodel;

import com.tamil.dp.strategy.main.behaviorInterfaces.FlyingBehavior;
import com.tamil.dp.strategy.main.behaviorInterfaces.QuackBehavior;

/**
 * @author Murugan_Nagarajan 
 */

/**
 * Our Strategy Pattern example is done just with the Duck Method. This
 * DecoyDuck class is created for additional practice. Just to make use of the
 * Family of Algorithms/Behaviors created for a Duck class in a another
 * completely different class.
 *
 */
public abstract class DuckBaitDevice {

	public FlyingBehavior flyBehave;
	public QuackBehavior quackBehave;

	/**
	 * We can dynamically change the behavior of a object during runtime by
	 * creating setter methods for these above interface objects.
	 */

	public void swim() {
		System.out
				.println("As a duck, by default I can swim. Even a decoy duck can float.");
	}

	public abstract void displayDetail();

	public void performFly() {
		flyBehave.fly();
	}

	public void performQuack() {
		quackBehave.quack();
	}

	/**
	 * @param flyBehave
	 *            the flyBehave to set
	 */
	public void setFlyBehave(FlyingBehavior flyBehave) {
		this.flyBehave = flyBehave;
	}

	/**
	 * @param quackBehave
	 *            the quackBehave to set
	 */
	public void setQuackBehave(QuackBehavior quackBehave) {
		this.quackBehave = quackBehave;
	}

}
