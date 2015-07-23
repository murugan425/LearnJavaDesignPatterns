/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:15:14 AM
 */
package com.tamil.dp.strategy;

import com.tamil.dp.strategy.behaviorimpl.flyingimpls.FlyWithDesignedWings;
import com.tamil.dp.strategy.behaviorimpl.quackimpls.QuackSound;
import com.tamil.dp.strategy.childmodels.DecoyDuck;
import com.tamil.dp.strategy.childmodels.RedHeadDuck;
import com.tamil.dp.strategy.childmodels.RubberDuck;
import com.tamil.dp.strategy.mainmodel.Duck;
import com.tamil.dp.strategy.mainmodel.DuckBaitDevice;

/**
 * @author Murugan_Nagarajan
 *
 */
public class SimulateDuck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Simply create a red head duck object and check its behavior */
		Duck redHeadDuck = new RedHeadDuck();
		simulateDuck(redHeadDuck);		
		
		/* Simply create a rubber duck object and check its behavior */
		Duck rubberDuck = new RubberDuck();
		simulateDuck(rubberDuck);
		/*Let's change the behavior dynamically*/
		rubberDuck.setFlyBehave(new FlyWithDesignedWings());
		simulateDuck(rubberDuck);
		
		/* Simply create a decoy head duck object and check its behavior */
		DuckBaitDevice decoyDuck = new DecoyDuck();
		simulateDecoyDuck(decoyDuck);
		/*Let's change the behavior dynamically*/
		decoyDuck.setFlyBehave(new FlyWithDesignedWings());
		decoyDuck.setQuackBehave(new QuackSound());
		simulateDecoyDuck(decoyDuck);
		
	}
	
	static void simulateDuck(Duck duck) {
		duck.displayDetail();
		duck.swim();
		duck.performFly();
		duck.performQuack();
		System.out.println("======================================");
	}
	
	static void simulateDecoyDuck(DuckBaitDevice decoy) {
		decoy.displayDetail();
		decoy.swim();
		decoy.performFly();
		decoy.performQuack();
		System.out.println("======================================");
	}

}
