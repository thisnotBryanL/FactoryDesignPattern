package edu.baylor.ecs.csi.factoryMethod;

import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.product.impl.TargetProduct;
import edu.baylor.ecs.csi.factoryMethod.store.Store;
import edu.baylor.ecs.csi.factoryMethod.store.impl.Target;

public class TargetUserTest extends UserTest {

    protected Store makeStore(){
        return new Target();
    }

    @Override
    protected Product makeProduct(String name) {
        return new TargetProduct();
    }
}
