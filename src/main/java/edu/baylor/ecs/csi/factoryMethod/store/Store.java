package edu.baylor.ecs.csi.factoryMethod.store;

import java.util.ArrayList;
import java.util.List;

import edu.baylor.ecs.csi.factoryMethod.cart.ShoppingCart;
import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;

public abstract class Store {

	private List<ShoppingCart> orderList = new ArrayList<ShoppingCart>();

	private ShoppingCart order = null;
	private Distributor distributor = null;

	public abstract List<Distributor> getDistributorList(); // force to override
	protected void hookProcess(ShoppingCart order)  throws Exception {} // voluntary override

	final protected Distributor getSelectedDistributor() {
		return distributor;
	}

	final public void selectDistributor(int index) {
		distributor = getDistributorList().get(index);

	}

	final public void process(ShoppingCart order) throws Exception {
		if(distributor == null) {
			throw new Exception("Select distributor");
		}
		hookProcess(order);
		
		this.order = order;
		distributor.ship(this.order);
		orderList.add(this.order);
	}

}
