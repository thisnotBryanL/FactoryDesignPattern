package edu.baylor.ecs.csi.factoryMethod.store.impl;

import java.util.Arrays;
import java.util.List;

import edu.baylor.ecs.csi.factoryMethod.cart.ShoppingCart;
import edu.baylor.ecs.csi.factoryMethod.cart.CartLineItem;
import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.DHL;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.UPS;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.USPS;
import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.product.impl.WalmartProduct;
import edu.baylor.ecs.csi.factoryMethod.store.Store;

public class Walmart extends Store {

	private List<Distributor> distributorList = null;
	
	public Walmart() {
		Distributor[] distributors = { new DHL(), new UPS(), new USPS()};
		distributorList = Arrays.asList(distributors);
	}

	public Walmart(List<Distributor> distributorList) {
		this.distributorList = distributorList;
	}
	
	@Override
	public List<Distributor> getDistributorList() {
		return distributorList;
	}

	@Override
	protected void hookProcess(ShoppingCart order) throws Exception {
		System.out.println(Walmart.class.getSimpleName() + " is happy for your order");
		for (CartLineItem line : order.getOrderList()) {
			Product product = line.getProduct();
			System.out.println("* " + product.getName() + " " + line.getQuantity() + "x " + product.getPrice());
			if (product instanceof WalmartProduct) {
				System.out.println("- Rank... " + ((WalmartProduct) product).getRank());
			} else {
				throw new Exception("Not a Walmart product");
			}

		}
		System.out.println("Total: " + order.getTotal());

	}

}
