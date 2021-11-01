package com.gildedrose.application.updater;

import java.util.HashMap;
import java.util.Map;

public final class ItemUpdater {

    private static final Map<String, UpdateStoreItem> updaterInstances;
    private static final UpdateStoreItem genericItem;

    static {
        genericItem = new GenericItemImpl(new QualityFactorDegreeImpl());

        updaterInstances = new HashMap<>();
        updaterInstances.put("Sulfuras, Hand of Ragnaros", new SulfurasStoreItemImpl());
        updaterInstances.put("Backstage passes to a TAFKAL80ETC concert", new BackstageStoreItemImpl());
        updaterInstances.put("Aged Brie", new BrieStoreItemImpl());
        updaterInstances.put("Conjured Mana Cake", new GenericItemImpl(new QualityFactorDegreeImpl(2)));
    }


    private ItemUpdater() {
    }

    public static UpdateStoreItem from(String type) {
        return updaterInstances.getOrDefault(type, genericItem);
    }

}
