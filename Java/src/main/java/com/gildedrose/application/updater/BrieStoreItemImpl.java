package com.gildedrose.application.updater;

import com.gildedrose.Item;

final class BrieStoreItemImpl implements UpdateStoreItem {

    private static final int MAX_QUALITY= 50;

    @Override
    public void update(Item item) {

        if (item.sellIn > 0) {
            item.sellIn--;
        }

        if (item.quality < MAX_QUALITY) {
            if (item.sellIn == 0 && item.quality < MAX_QUALITY-1) {
                item.quality += 2;
            } else {
                item.quality++;
            }
        }
    }
}
