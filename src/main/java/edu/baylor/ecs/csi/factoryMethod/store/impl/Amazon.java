package edu.baylor.ecs.csi.factoryMethod.store.impl;

import edu.baylor.ecs.csi.factoryMethod.cart.ShoppingCart;
import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.USPS;
import edu.baylor.ecs.csi.factoryMethod.store.Store;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Amazon extends Store {
    private List<Distributor> distributorList = null;

    public  Amazon(){
        Distributor [] distributors = {new USPS()};
        distributorList = Arrays.asList(distributors);
    }

    public Amazon(List<Distributor> distributorList) {
        this.distributorList = distributorList;
    }

    @Override
    public List<Distributor> getDistributorList() {
        return null;
    }

    @Override
    protected void hookProcess(ShoppingCart order) throws Exception {
        super.hookProcess(order);
    }
}
