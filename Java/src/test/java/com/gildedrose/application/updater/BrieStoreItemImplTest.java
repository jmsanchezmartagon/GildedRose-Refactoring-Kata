package com.gildedrose.application.updater;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BrieStoreItemImplTest {

    private UpdateStoreItem updateStoreItem = new BrieStoreItemImpl();

    @Test
    public void should_noUpdateSellIn_when_hasZero(){
        Item zeroItem = new Item("zero",0,0);
        updateStoreItem.update(zeroItem);
        assertEquals(0,zeroItem.sellIn);
    }

    @Test
    public void should_incrementDoubleQuality_when_sellInHasZero(){
        Item zeroItem = new Item("zero",0,4);
        updateStoreItem.update(zeroItem);
        assertEquals(0,zeroItem.sellIn);
        assertEquals(6,zeroItem.quality);
    }

    @Test
    public void should_incrementDoubleQuality_when_sellIHasOne(){
        Item zeroItem = new Item("zero",1,4);
        updateStoreItem.update(zeroItem);
        assertEquals(0,zeroItem.sellIn);
        assertEquals(6,zeroItem.quality);
    }

    @Test
    public void should_incremntSimpleQuality_when_sellIHasTwo(){
        Item zeroItem = new Item("zero",2,4);
        updateStoreItem.update(zeroItem);
        assertEquals(1,zeroItem.sellIn);
        assertEquals(5,zeroItem.quality);
    }

    @Test
    public void should_NoUpdateQuality_when_QualityHas50(){
        Item zeroItem = new Item("zero",2,50);
        updateStoreItem.update(zeroItem);
        assertEquals(1,zeroItem.sellIn);
        assertEquals(50,zeroItem.quality);
    }

    @Test
    public void should_NoUpdateQuality_when_QualityHas50AndSellInZero(){
        Item zeroItem = new Item("zero",0,50);
        updateStoreItem.update(zeroItem);
        assertEquals(0,zeroItem.sellIn);
        assertEquals(50,zeroItem.quality);
    }

    @Test
    public void should_get50Quality_when_QualityHas49AndSellInZero(){
        Item zeroItem = new Item("zero",0,49);
        updateStoreItem.update(zeroItem);
        assertEquals(0,zeroItem.sellIn);
        assertEquals(50,zeroItem.quality);
    }

    @Test
    public void should_get50Quality_when_QualityHas49AndSellInOne(){
        Item zeroItem = new Item("zero",1,49);
        updateStoreItem.update(zeroItem);
        assertEquals(0,zeroItem.sellIn);
        assertEquals(50,zeroItem.quality);
    }
}
