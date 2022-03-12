package designPatterns;

import flyBehaviors.FlyBehavior;
import quackBehaviors.QuackBehavior;

public abstract class Duck {
	
	FlyBehavior flyBehavior;		// Fly behavior reference variable
	QuackBehavior quackBehavior;	// Quack behavior reference variable
	
	public Duck() {}				// Constructor
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	
	/* Setting the fly behavior dynamically on the fly! */
	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	/* Setting the quack behavior dynamically on the fly! */
	public void setQuackBehavior (QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
