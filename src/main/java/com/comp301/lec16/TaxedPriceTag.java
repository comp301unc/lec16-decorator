package com.comp301.lec16;

public interface TaxedPriceTag extends PriceTag {
    double getTax();
    double getTaxRate();
    PriceTag getPreTaxPriceTag();
}
