package edu.baylor.ecs.csi.factoryMethod;

import edu.baylor.ecs.csi.factoryMethod.distributor.DistributionByPriceStrategy;
import edu.baylor.ecs.csi.factoryMethod.product.Product;
import edu.baylor.ecs.csi.factoryMethod.product.impl.WalmartProduct;
import edu.baylor.ecs.csi.factoryMethod.store.Store;
import edu.baylor.ecs.csi.factoryMethod.store.impl.Walmart;
import org.junit.jupiter.api.BeforeEach;

public class UserTestWithPriceStrat extends UserTest {
    @Override
    @BeforeEach
    public void setUp() {
        super.setUp();
        distruStra = new DistributionByPriceStrategy();
    }

    protected Store makeStore(){
        return new Walmart();
    }

    @Override
    protected Product makeProduct(String name) {
        return new WalmartProduct(name);
    }
}
