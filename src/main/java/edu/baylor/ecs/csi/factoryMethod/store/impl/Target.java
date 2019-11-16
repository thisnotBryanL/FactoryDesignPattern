package edu.baylor.ecs.csi.factoryMethod.store.impl;

import java.util.Arrays;
import java.util.List;

import edu.baylor.ecs.csi.factoryMethod.cart.ShoppingCart;
import edu.baylor.ecs.csi.factoryMethod.cart.CartLineItem;
import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.USPS;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.WacoNationalPost;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.UPS;
import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.store.Store;

public class Target extends Store {

	private List<Distributor> distributorList = null;

	public Target() {
		Distributor[] distributors = { new WacoNationalPost(), new UPS(), new USPS()};
		distributorList = Arrays.asList(distributors);
	}

	public Target(List<Distributor> distributorList) {
		this.distributorList = distributorList;
	}

	@Override
	public List<Distributor> getDistributorList() {
		return distributorList;
	}

	@Override
	protected void hookProcess(ShoppingCart order) throws Exception {
		System.out.println(Target.class.getSimpleName() + " is happy for your order");
		for (CartLineItem line : order.getOrderList()) {
			Product product = line.getProduct();
			System.out.println("+ " + product.getName() + " " + line.getQuantity() + "x " + product.getPrice());

		}
		System.out.println("Total: " + order.getTotal());

	}

}
