package edu.baylor.ecs.csi.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import edu.baylor.ecs.csi.builder.Sandwich;
import edu.baylor.ecs.csi.builder.SandwichBuilder;
import edu.baylor.ecs.csi.builder.Waiter;
import edu.baylor.ecs.csi.builder.impl.BlackFirestHamBuilder;


public class UserTest {


	@Test
	public void test() throws Exception {
		SandwichBuilder builder = new BlackFirestHamBuilder();
		// builder = new RoastBeefFootlongBuilder();

		Waiter waiter = new Waiter();

		waiter.setSandwichBuilder(builder);
		waiter.constructSandwich(Sandwich.FOOTLONG);

		BigDecimal charge = waiter.getCharge();
		Sandwich sandwich = waiter.getSandwich();
		
		assertEquals(160, charge.intValue());
		assertEquals("Sandwich [footlong=true, bread=9-Grain"
		+" Wheat, meat=Ham, cheese=Cheddar, veggies=Cucumbers,"
		+" Green Peppers, Lettuce, Red Onions, Tomatoes,"
		+" sauce=Honey Mustard, extras=Avocado]", sandwich.toString());
		System.out.println(charge);
		System.out.println(sandwich);
	}

}