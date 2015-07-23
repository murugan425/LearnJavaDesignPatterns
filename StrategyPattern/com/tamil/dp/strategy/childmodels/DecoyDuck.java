/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:30:24 AM
 */
package com.tamil.dp.strategy.childmodels;

import com.tamil.dp.strategy.behaviorimpl.flyingimpls.FlyNoWay;
import com.tamil.dp.strategy.behaviorimpl.quackimpls.MuteSound;
import com.tamil.dp.strategy.mainmodel.DuckBaitDevice;

/**
 * @author Murugan_Nagarajan
 *
 */
public class DecoyDuck extends DuckBaitDevice {

	/**
	 * Here we are declaring the respective flying behavior of Red Head duck
	 * during instantiation or object initialization using the constructor.
	 */
	public DecoyDuck() {
		flyBehave = new FlyNoWay();
		quackBehave = new MuteSound();
	}
	
	/* (non-Javadoc)
	 * @see com.tamil.dp.strategy.mainmodel.DuckBaitDevice#displayDetail()
	 */
	@Override
	public void displayDetail() {
		System.out.println("I was used as a decoy in duck shooting.");		
	}

}
