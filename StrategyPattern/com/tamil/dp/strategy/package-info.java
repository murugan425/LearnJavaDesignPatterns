/**
 * Three Basic Design Principles of this Strategy Pattern.
 * 1. Encapsulate the methods/behaviors that varies separately. (Family of Algorithms)
 * 2. Prefer composistion (HAS-A relation interface) than inheritance.
 * 3. Program to intreface, not based on implementations.
 * 		(In implementations the object methods will be tightly bound)
 */
/**
 * @author	: Murugan_Nagarajan
 * @date	: Jul 24, 2015
 * @time	: 1:15:14 AM
 */
package com.tamil.dp.strategy;

/**
 * Without a STRATEGY design pattern, if we have done the coding just by making use 
 * of interfaces logic, we would have ended up implementing the different flying &
 * quack behavior in each and every subclasses of the Duck method and even a
 * slight change in single behavior will require a huge code change in all those child
 * classes.(Implemented Point 1) Hence the maintainability is a hell and the code re-usability is
 * completely missed.Also, for dynamically changing these behaviors on runtime will help 
 * loose coupling of the objects. (Implemented Point 2 & 3 for that), So just knowing/using 
 * of java basic OO concepts will not be enough to achieve/code in a better way.
 * 
 */
