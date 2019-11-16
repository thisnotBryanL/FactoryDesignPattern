package edu.baylor.ecs.csi.factoryMethod.distributor.impl;

import java.math.BigDecimal;
import java.net.URL;

import edu.baylor.ecs.csi.factoryMethod.cart.ShoppingCart;
import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;

public class WacoNationalPost extends Distributor {

	@Override
	public BigDecimal getCharge() {
		// location estimate
		return new BigDecimal(150);
	}

	@Override
	public double getRank() {
		// some more detailed calculation
		return 2.5;
	}

	@Override
	public URL getTrackingLink() throws Exception {
		return new URL("http://www.wp.com/tracking");
	}

	@Override
	public void ship(ShoppingCart order) throws Exception {
		ship("cpost", order);
		System.out.println("# Send to D.C.");
		System.out.println("# Distribute locally");
		System.out.println("# Distribute locally");
		System.out.println("# Distribute locally");
		System.out.println("# Send to Customer");
	}

}
