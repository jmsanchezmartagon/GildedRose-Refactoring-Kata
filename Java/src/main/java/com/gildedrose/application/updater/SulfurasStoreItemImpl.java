package com.gildedrose.application.updater;

import com.gildedrose.Item;

final class SulfurasStoreItemImpl implements UpdateStoreItem {

    public static final int MAX_QUALITY = 80;

    @Override
    public void update(Item item) {
        item.quality = MAX_QUALITY;
    }
}
