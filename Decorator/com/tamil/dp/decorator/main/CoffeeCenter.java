/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 27, 2015
 * @time	: 2:45:23 PM
 */
package com.tamil.dp.decorator.main;

import com.tamil.dp.decorator.abstractcomponent.Beverage;
import com.tamil.dp.decorator.decoratorscomponents.Grande;
import com.tamil.dp.decorator.decoratorscomponents.Milk;
import com.tamil.dp.decorator.decoratorscomponents.Mocha;
import com.tamil.dp.decorator.decoratorscomponents.Soy;
import com.tamil.dp.decorator.decoratorscomponents.Tall;
import com.tamil.dp.decorator.decoratorscomponents.Venti;
import com.tamil.dp.decorator.decoratorscomponents.Whip;
import com.tamil.dp.decorator.maincomponents.DarkRoast;
import com.tamil.dp.decorator.maincomponents.Decaf;
import com.tamil.dp.decorator.maincomponents.Espresso;

/**
 * @author Murugan_Nagarajan
 *
 */
public class CoffeeCenter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage bev1 = new Espresso();
		Beverage bev2 = new Decaf();
		Beverage bev3 = new DarkRoast();

		System.out.println("Plain Espresso: " + bev1.getDescription() + ": "
				+ bev1.cost());

		System.out.println("=========================");

		bev2 = new Whip(new Soy(new Whip(bev2)));
		System.out.println("Decaf with two Whips and Soy\n"
				+ bev2.getDescription() + ": " + bev2.cost());

		System.out.println("=========================");

		bev3 = new Milk(bev3);
		bev3 = new Mocha(bev3);
		System.out.println("Dark Roast with extra Milk & Mocha\n"
				+ bev3.getDescription() + ": " + bev3.cost());

		/*
		 * Based on this design- we have a drawback, that the size of the
		 * beverage should be considered for cost calculation only after adding
		 * the flavors/condiments
		 */
		System.out.println("=========================");
		bev1 = new Tall(bev1);
		System.out.println(bev1.getDescription() + ": " + bev1.cost());
		System.out.println("=========================");
		bev2 = new Grande(bev2);
		System.out.println(bev2.getDescription() + ": " + bev2.cost());
		System.out.println("=========================");
		bev3 = new Venti(bev3);
		System.out.println(bev3.getDescription() + ": " + bev3.cost());
	}

}
