package edu.baylor.ecs.csi.factoryMethod.distributor.impl;

import edu.baylor.ecs.csi.factoryMethod.cart.ShoppingCart;
import edu.baylor.ecs.csi.factoryMethod.distributor.Distributor;

import java.math.BigDecimal;
import java.net.URL;

public class USPS extends Distributor {

    @Override
    public BigDecimal getCharge() {
        return new BigDecimal(6);
    }

    @Override
    public double getRank() {
        return 4.5;
    }

    @Override
    public URL getTrackingLink() throws Exception {
        return new URL("https://usps.com/track");
    }

    @Override
    public void ship(ShoppingCart order) throws Exception {
        ship("USPS",order);
    }
}
