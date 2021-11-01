package com.gildedrose;

import com.gildedrose.application.updater.ItemUpdater;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        if (items != null && items.length>0){
            for (Item item : items) {
                ItemUpdater.from(item.name).update(item);
            }
        }
    }
}
