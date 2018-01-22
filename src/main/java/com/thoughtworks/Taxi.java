package com.thoughtworks;

public class Taxi {
  private int city;
  static final int TIER_ONE = 1;
  static final int TIER_TWO = 2;
  static final int TIER_Three = 3;

  public Taxi(int city) {
    this.city = city;
  }

  public int charge(int miles) {
    switch (city) {
      case TIER_ONE:
        return miles * (miles >= 10 ? 50 : 30) + (miles >= 10 ? 100 : 0);
      case TIER_TWO:
        return miles * (miles >= 10 ? 25 : 20);
      case TIER_Three:
        return miles * 10;
      default:
        throw new RuntimeException("unsupport city");
    }
  }
}
