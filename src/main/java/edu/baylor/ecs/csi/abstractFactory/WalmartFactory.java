package edu.baylor.ecs.csi.abstractFactory;

import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.DHL;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.UPS;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.USPS;
import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.product.impl.WalmartProduct;
import edu.baylor.ecs.csi.factoryMethod.store.Store;
import edu.baylor.ecs.csi.factoryMethod.store.impl.Walmart;


import java.util.Arrays;
import java.util.List;

public class WalmartFactory extends AbstractFactory {

    @Override
    public List<Distributor> makeDistributorList() {
        Distributor[] distributors = { new DHL(), new UPS(), new USPS()};
       return Arrays.asList(distributors);

    }

    @Override
    protected Product makeProduct(String name) {
        return new WalmartProduct(name);
    }

    @Override
    public Store makeStore() {
        return new Walmart(makeDistributorList());
    }
}
