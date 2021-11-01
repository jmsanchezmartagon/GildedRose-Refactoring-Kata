package com.gildedrose.application.updater;

import com.gildedrose.Item;

final class GenericItemImpl implements UpdateStoreItem {

    private final QualityDegree degree;

    public GenericItemImpl(QualityDegree degree) {
        this.degree = degree;
    }

    @Override
    public void update(Item item) {

        if (item.sellIn > 0) {
            item.sellIn--;
        }

        if (item.quality > 0) {
            degree.degree(item);
        }
    }
}
