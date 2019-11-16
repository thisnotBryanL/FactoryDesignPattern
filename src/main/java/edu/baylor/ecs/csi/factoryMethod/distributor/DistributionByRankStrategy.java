package edu.baylor.ecs.csi.factoryMethod.distributor;

import edu.baylor.ecs.csi.factoryMethod.store.Store;

public class DistributionByRankStrategy implements IDistributionSelectionStrategy {
   public int select (Store store) {
        // <pick by rank> //TODO make me a strategy!
        int index = 0;
        double rank = 0;
        for (int i = 0; i < store.getDistributorList().size(); i++) {
            Distributor distributor = store.getDistributorList().get(i);
            if (distributor.getRank() > rank) {
                index = i;
                rank = distributor.getRank();
            }
            System.out.println("* " + distributor.getClass().getSimpleName() + " : " + rank);
        }
        System.out.println("*Top rank " + rank);
        return index;
    }
}
