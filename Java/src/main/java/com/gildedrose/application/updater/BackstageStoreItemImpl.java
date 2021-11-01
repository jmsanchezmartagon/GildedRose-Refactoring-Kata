package com.gildedrose.application.updater;

import com.gildedrose.Item;

final class BackstageStoreItemImpl implements UpdateStoreItem {
    @Override
    public void update(Item item) {

        if (item.sellIn > 0) {
            item.sellIn--;
        }

        if (item.quality > 0) {
            if (item.sellIn == 0) {
                item.quality = 0;
            } else if (item.sellIn <= 10 && item.sellIn > 5) {
                item.quality += 2;
            } else if (item.sellIn <= 5) {
                item.quality += 3;
            }
        }
    }
}
