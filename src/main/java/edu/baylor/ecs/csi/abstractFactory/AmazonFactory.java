package edu.baylor.ecs.csi.abstractFactory;

import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.USPS;
import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.product.impl.AmazonProduct;
import edu.baylor.ecs.csi.factoryMethod.store.Store;
import edu.baylor.ecs.csi.factoryMethod.store.impl.Amazon;

import java.util.Arrays;
import java.util.List;

public class AmazonFactory extends AbstractFactory {
    @Override
    public List<Distributor> makeDistributorList() {
        Distributor [] distributors = {new USPS()};
        return Arrays.asList(distributors);
    }

    @Override
    protected Product makeProduct(String name) {
        return new AmazonProduct(name);
    }

    @Override
    public Store makeStore() {
        return new Amazon(makeDistributorList());
    }
}
