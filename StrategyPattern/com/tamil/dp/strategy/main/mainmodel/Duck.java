/**
 * 
 */
package com.tamil.dp.strategy.main.mainmodel;

import com.tamil.dp.strategy.main.behaviorInterfaces.FlyingBehavior;
import com.tamil.dp.strategy.main.behaviorInterfaces.QuackBehavior;

/**
 * @author Murugan_Nagarajan
 *
 */
public abstract class Duck {
	
	public FlyingBehavior flyBehave;
	public QuackBehavior quackBehave;
	
	public void swim() {
		System.out.println("As a duck, by default I can swim. Even a decoy duck can float.");
	}
	
	public abstract void displayDetail();
	
	public void performFly() {
		flyBehave.fly();
	}
	
	public void performQuack() {
		quackBehave.quack();
	}
	
	/**
	 * @param flyBehave the flyBehave to set
	 */
	public void setFlyBehave(FlyingBehavior flyBehave) {
		this.flyBehave = flyBehave;
	}

	/**
	 * @param quackBehave the quackBehave to set
	 */
	public void setQuackBehave(QuackBehavior quackBehave) {
		this.quackBehave = quackBehave;
	}
}
