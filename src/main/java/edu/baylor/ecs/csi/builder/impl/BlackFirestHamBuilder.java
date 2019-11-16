package edu.baylor.ecs.csi.builder.impl;

import edu.baylor.ecs.csi.builder.SandwichBuilder;

/* "ConcreteBuilder" */
public class BlackFirestHamBuilder extends SandwichBuilder {

	@Override
	public void buildFootlong() {
		sandwich.setFootlong(true);
	}
	@Override
	public void buildBread() {
		sandwich.setBread("9-Grain Wheat");
		addCost(10);
	}

	@Override
	public void buildMeat() {
		sandwich.setMeat("Ham");
		addCost(10);
	}

	@Override
	public void buildCheese() {
		sandwich.setCheese("Cheddar");
		addCost(10);
	}

	@Override
	public void buildVeggies() {
		sandwich.getVeggies().add("Cucumbers");
		sandwich.getVeggies().add("Green Peppers");
		sandwich.getVeggies().add("Lettuce");
		sandwich.getVeggies().add("Red Onions");
		sandwich.getVeggies().add("Tomatoes");
		addCost(25);
		
	}
	@Override
	public void buildSauce() {
		sandwich.getSauce().add("Honey Mustard");
		addCost(5);
		
	}

	@Override
	public void buildExtras() {
		sandwich.getExtras().add("Avocado");
		addCost(10);
		
	}

}