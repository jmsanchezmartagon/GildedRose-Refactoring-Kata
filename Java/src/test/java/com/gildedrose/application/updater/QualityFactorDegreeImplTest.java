package com.gildedrose.application.updater;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualityFactorDegreeImplTest {

    private QualityFactorDegreeImpl qualityFactorDegree = new QualityFactorDegreeImpl();

    @Test
    public void should_noUpdateSellInNoQuality_when_hasZero(){
        Item zeroItem = new Item("zero",0,0);
        qualityFactorDegree.degree(zeroItem);
        assertEquals(0,zeroItem.quality);
    }

    @Test
    public void should_NoUpdateSellInUpdateQuality_when_SellInHasZero(){
        Item zeroItem = new Item("zero",0,2);
        qualityFactorDegree.degree(zeroItem);
        assertEquals(0,zeroItem.quality);
    }

    @Test
    public void should_reduceDoubleQuality_when_sellInHasZero(){
        Item zeroItem = new Item("zero",0,4);
        qualityFactorDegree.degree(zeroItem);
        assertEquals(2,zeroItem.quality);
    }

    @Test
    public void should_reduceDoubleQuality_when_sellIHasOne(){
        Item zeroItem = new Item("zero",0,4);
        qualityFactorDegree.degree(zeroItem);
        assertEquals(2,zeroItem.quality);
    }


    @Test
    public void should_reduceSimpleQuality_when_sellIHasTwo(){
        Item zeroItem = new Item("zero",2,4);
        qualityFactorDegree.degree(zeroItem);
        assertEquals(3,zeroItem.quality);
    }

    @Test
    public void should_UpdateSellInNoUpdateQuality_when_QualityHasZero(){
        Item zeroItem = new Item("zero",2,0);
        qualityFactorDegree.degree(zeroItem);
        assertEquals(0,zeroItem.quality);
    }
}
