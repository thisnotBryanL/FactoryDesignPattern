package edu.baylor.ecs.csi.factoryMethod.distributor;

import edu.baylor.ecs.csi.factoryMethod.store.Store;

public interface IDistributionSelectionStrategy {
    int select (Store store);
}
