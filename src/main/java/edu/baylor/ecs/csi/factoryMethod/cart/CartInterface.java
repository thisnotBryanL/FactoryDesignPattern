package edu.baylor.ecs.csi.factoryMethod.cart;

import edu.baylor.ecs.csi.factoryMethod.product.Product;

public interface CartInterface {
    CartInterface addLine(Product product, int amount);
}
