package edu.baylor.ecs.csi.abstractFactory;

import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;
import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.store.Store;

import java.util.List;

abstract class AbstractFactory {
    abstract public List<Distributor> makeDistributorList();
    abstract protected Product makeProduct(String name);
    abstract public Store makeStore();
}
