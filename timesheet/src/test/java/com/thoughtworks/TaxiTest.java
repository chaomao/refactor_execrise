package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TaxiTest {
  @Test
  public void TierThreeChargeMileWith10() throws Exception {
    Taxi taxi = new Taxi(Taxi.TIER_THREE);
    assertThat(taxi.charge(5), is(5 * 10));
  }

  @Test
  public void TierTwoChargeMileWith20WhenMileLessThan10Miles() throws Exception {
    Taxi taxi = new Taxi(Taxi.TIER_TWO);
    assertThat(taxi.charge(9), is(9 * 20));
  }

  @Test
  public void TierTwoChargeMileWith25WhenMileMOREThan10Miles() throws Exception {
    Taxi taxi = new Taxi(Taxi.TIER_TWO);
    assertThat(taxi.charge(10), is(10 * 25));
  }

  @Test
  public void TierONEChargeMileWith30WhenMileLessThan10Miles() throws Exception {
    Taxi taxi = new Taxi(Taxi.TIER_ONE);
    assertThat(taxi.charge(9), is(9 * 30));
  }

  @Test
  public void TierONEChargeMileWith50WAnd100TaxWhenMileMOREThan10Miles() throws Exception {
    Taxi taxi = new Taxi(Taxi.TIER_ONE);
    assertThat(taxi.charge(10), is(10 * 50 + 100));
  }
}
