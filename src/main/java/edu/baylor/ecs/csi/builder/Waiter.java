package edu.baylor.ecs.csi.builder;

import java.math.BigDecimal;

/* "Director" */
public class Waiter {
	private SandwichBuilder sandwichBuilder;

	public void setSandwichBuilder(SandwichBuilder sandwichBuilder) {
		this.sandwichBuilder = sandwichBuilder;
	}

	public Sandwich getSandwich() {
		return sandwichBuilder.getSandwich();
	}

	public BigDecimal getCharge() {
		return sandwichBuilder.getCharge();
	}

	public void constructSandwich(boolean footlong) {
		sandwichBuilder.createNewSandwichProduct();
		if(footlong) {
			sandwichBuilder.buildFootlong();
		}
		sandwichBuilder.buildBread();
		sandwichBuilder.buildMeat();
		sandwichBuilder.buildCheese();
		sandwichBuilder.buildVeggies();
		sandwichBuilder.buildSauce();
		sandwichBuilder.buildExtras();
	}
}