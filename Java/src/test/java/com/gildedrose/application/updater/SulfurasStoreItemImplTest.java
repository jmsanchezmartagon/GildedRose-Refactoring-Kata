package com.gildedrose.application.updater;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SulfurasStoreItemImplTest {

    private UpdateStoreItem updateStoreItem = new SulfurasStoreItemImpl();

    @Test
    public void should_holdSellIn_when_zero(){
        Item zeroItem = new Item("zero",0,0);
        updateStoreItem.update(zeroItem);
        assertEquals(0,zeroItem.sellIn);
    }

    @Test
    public void should_holdSellIn_when_noZero(){
        int expectedValue = 10;
        Item zeroItem = new Item("zero",expectedValue,0);
        updateStoreItem.update(zeroItem);
        assertEquals(expectedValue,zeroItem.sellIn);
    }

    @Test
    public void should_fixedQuality_when_sellinZero(){
        Item zeroItem = new Item("zero",0, SulfurasStoreItemImpl.MAX_QUALITY);
        updateStoreItem.update(zeroItem);
        assertEquals(0,zeroItem.sellIn);
        assertEquals(SulfurasStoreItemImpl.MAX_QUALITY,zeroItem.quality);
    }

    @Test
    public void should_fixQuality_when_sellIHasOne(){
        Item zeroItem = new Item("zero",6, SulfurasStoreItemImpl.MAX_QUALITY);
        updateStoreItem.update(zeroItem);
        assertEquals(6,zeroItem.sellIn);
        assertEquals(SulfurasStoreItemImpl.MAX_QUALITY,zeroItem.quality);
    }

    @Test
    public void should_getDefaultQuality(){
        Item zeroItem = new Item("zero",2,4);
        updateStoreItem.update(zeroItem);
        assertEquals(2,zeroItem.sellIn);
        assertEquals(SulfurasStoreItemImpl.MAX_QUALITY,zeroItem.quality);
    }

}
