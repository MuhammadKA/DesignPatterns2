/**
 * 											<< The Strategy Pattern >>
 * 			Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets
 * 								the algorithm vary independently from clients that use it.
 *  
 * We are using Strategy Pattern to implement various behaviors of our ducks.
 * This means: the duck behavior has been encapsulated into its own set of classes that 
 * classes that can be easily expanded and changed, even at runtime if needed.
 * 
 * */

package designPatterns;

import flyBehaviors.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	
}
