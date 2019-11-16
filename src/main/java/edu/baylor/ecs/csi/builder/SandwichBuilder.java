package edu.baylor.ecs.csi.builder;

import java.math.BigDecimal;

/* "Abstract Builder" */
public abstract class SandwichBuilder {
	
	protected Sandwich sandwich;
	protected BigDecimal total = BigDecimal.ZERO;

	public Sandwich getSandwich() {
		return sandwich;
	}
	public BigDecimal getCharge() {
		if(sandwich.isFootlong()) {
			return total.multiply(new BigDecimal(2));
		} else {
			return total;
		}
	}

	protected void addCost(int addition) {
		total = total.add(new BigDecimal(addition));
	}
	protected void addCost(BigDecimal addition) {
		total = total.add(addition);
	}
	
	public void createNewSandwichProduct() {
		sandwich = new Sandwich();
		// SubWay surcharge
		addCost(10);
	}

	public abstract void buildBread();

	public abstract void buildMeat();

	public abstract void buildCheese();

	public abstract void buildVeggies();

	public abstract void buildExtras();

	public abstract void buildSauce();

	public void buildFootlong() {
		sandwich.setFootlong(true);
	}

}
