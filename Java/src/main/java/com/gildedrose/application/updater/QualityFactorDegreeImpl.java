package com.gildedrose.application.updater;

import com.gildedrose.Item;

final class QualityFactorDegreeImpl implements QualityDegree {

    private final int degreeZeroSellIn;

    public QualityFactorDegreeImpl() {
        this(1);
    }

    public QualityFactorDegreeImpl(int factor) {
        degreeZeroSellIn = 2*factor;
    }

    @Override
    public void degree(Item item) {
        if (item.quality>0) {
            if (item.sellIn == 0 ) {
                item.quality -= degreeZeroSellIn;
                if (item.quality<0){
                    item.quality = 0;
                }
            } else {
                item.quality -= 1;
            }
        }
    }
}
