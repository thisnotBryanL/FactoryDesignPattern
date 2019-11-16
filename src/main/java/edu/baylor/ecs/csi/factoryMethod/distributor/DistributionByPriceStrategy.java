package edu.baylor.ecs.csi.factoryMethod.distributor;

import edu.baylor.ecs.csi.factoryMethod.store.Store;

import java.math.BigDecimal;

public class DistributionByPriceStrategy implements IDistributionSelectionStrategy {
    @Override
    public int select(Store store) {
        int index = 0;
        BigDecimal price = new BigDecimal(0);
        for (int i = 0; i < store.getDistributorList().size(); i++) {
            Distributor distributor = store.getDistributorList().get(i);
            if (distributor.getCharge().compareTo(price) > 0) {
                index = i;
                price = distributor.getCharge();
            }
            System.out.println("* " + distributor.getClass().getSimpleName() + " : " + price);
        }
        System.out.println("*Top Price " + price);


        return index;
    }
}
