package edu.baylor.ecs.csi.abstractFactory;

import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.UPS;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.USPS;
import edu.baylor.ecs.csi.factoryMethod.distributor.impl.WacoNationalPost;
import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.product.impl.TargetProduct;
import edu.baylor.ecs.csi.factoryMethod.store.Store;
import edu.baylor.ecs.csi.factoryMethod.store.impl.Target;

import java.util.Arrays;
import java.util.List;

public class TargetFactory extends AbstractFactory{
    @Override
    public List<Distributor> makeDistributorList() {
        Distributor[] distributors = { new WacoNationalPost(), new UPS(), new USPS()};
        return Arrays.asList(distributors);
    }

    @Override
    protected Product makeProduct(String name) {
        return new TargetProduct(name);
    }

    @Override
    public Store makeStore() {
        return new Target(makeDistributorList());
    }
}
