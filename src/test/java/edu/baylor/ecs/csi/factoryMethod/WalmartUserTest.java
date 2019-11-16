package edu.baylor.ecs.csi.factoryMethod;

import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.product.impl.WalmartProduct;
import edu.baylor.ecs.csi.factoryMethod.store.Store;
import edu.baylor.ecs.csi.factoryMethod.store.impl.Walmart;

public class WalmartUserTest extends UserTest {

	// pick a store
	protected Store makeStore() {
		return new Walmart();
	}

	protected Product makeProduct(String name) {
		return new WalmartProduct(name);
	}



}
