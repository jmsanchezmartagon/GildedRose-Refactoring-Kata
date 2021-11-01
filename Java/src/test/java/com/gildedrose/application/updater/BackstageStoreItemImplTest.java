package com.gildedrose.application.updater;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BackstageStoreItemImplTest {

    UpdateStoreItem updateStoreItem = new BackstageStoreItemImpl();

    @Test
    public void should_noUpdateSellInAndQualityZero_when_sellInHasZero(){
        Item zeroItem = new Item("zero",0,10);
        updateStoreItem.update(zeroItem);
        assertEquals(0,zeroItem.sellIn);
        assertEquals(0,zeroItem.quality);
    }

    @Test
    public void should_holdQuality_when_SellInIsMayor10(){
        Item zeroItem = new Item("zero",12,2);
        updateStoreItem.update(zeroItem);
        assertEquals(11,zeroItem.sellIn);
        assertEquals(2,zeroItem.quality);
    }

    @Test
    public void should_holdQuality_when_SellInIs10(){
        Item zeroItem = new Item("zero",11,2);
        updateStoreItem.update(zeroItem);
        assertEquals(10,zeroItem.sellIn);
        assertEquals(4,zeroItem.quality);
    }


    @Test
    public void should_holdQuality_when_SellInIs5(){
        Item zeroItem = new Item("zero",6,2);
        updateStoreItem.update(zeroItem);
        assertEquals(5,zeroItem.sellIn);
        assertEquals(5,zeroItem.quality);
    }
}
