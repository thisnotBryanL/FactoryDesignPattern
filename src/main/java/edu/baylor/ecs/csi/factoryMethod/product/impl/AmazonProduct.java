package edu.baylor.ecs.csi.factoryMethod.product.impl;

import edu.baylor.ecs.csi.factoryMethod.product.Product;

import java.math.BigDecimal;

public class AmazonProduct extends Product {
    public AmazonProduct(String name, String describtion, BigDecimal price) {
        super(name, describtion, price);
    }

    public AmazonProduct() {
        super();
    }

    public AmazonProduct(String name) {
        super(name);
    }


    @Override
    public BigDecimal getPrice() {
        BigDecimal discount = new BigDecimal(.10);
        BigDecimal newPrice = super.getPrice().multiply(discount);
        return newPrice;
    }



    @Override
    public AmazonProduct init(String describtion, BigDecimal price) {
        super.init(describtion, price);
        return this;
    }
}
