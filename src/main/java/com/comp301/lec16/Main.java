package com.comp301.lec16;

public class Main {
  public static void main(String[] args) {
    PriceTag basicTag = new PriceTagImpl(100);
    PriceTag discountTag1 = new DiscountedPriceTag(basicTag, 20);
    PriceTag discountTag2 = new DiscountedPriceTag(discountTag1, 20);
  }
}
