package designPatterns;

import flyBehaviors.FlyWithWings;
import quackBehaviors.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		/* Here we are programming to an implementation (not so good!) */
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack(); 
	}

	public void display() {
		System.out.println("I'm a real Mallard duck!");
	}

	
}
