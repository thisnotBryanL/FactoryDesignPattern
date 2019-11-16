package edu.baylor.ecs.csi.builder.impl;

import edu.baylor.ecs.csi.builder.SandwichBuilder;

/* "ConcreteBuilder" */
public class RoastBeefBuilder extends SandwichBuilder {

	@Override
	public void buildBread() {
		sandwich.setBread("Italian Herbs & Cheese");
		addCost(10);
	}

	@Override
	public void buildMeat() {
		sandwich.setMeat("RoastBeef");
		addCost(15);
	}

	@Override
	public void buildCheese() {
		sandwich.setCheese("Swiss");
		addCost(10);
	}

	@Override
	public void buildVeggies() {
		sandwich.getVeggies().add("Jalapenos");
		sandwich.getVeggies().add("Green Peppers");
		sandwich.getVeggies().add("Lettuce");
		sandwich.getVeggies().add("Black Olives");
		sandwich.getVeggies().add("Tomatoes");
		addCost(25);
		
	}
	@Override
	public void buildSauce() {
		sandwich.getSauce().add("Chipotle Southwest");
		addCost(5);
		
	}

	@Override
	public void buildExtras() {
		sandwich.getExtras().add("Pepperoni");
		addCost(10);
		
	}

}