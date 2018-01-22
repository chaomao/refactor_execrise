package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PersonTest {

  @Test
  public void maleGetTelephoneNumberAndNameWithAreaCodeAndNumber() {
    Person male = new Person("Jim", "86", "123456", Gender.MALE);
    assertThat(male.getTelephoneNumber(), is("+86-123456"));
    assertThat(male.getFullName(), is("Mr Jim"));
  }

  @Test
  public void femaleGetTelephoneNumberAndNameWithAreaCodeAndNumber() {
    Person male = new Person("Lucy", "01", "98765", Gender.FEMALE);
    assertThat(male.getTelephoneNumber(), is("+01-98765"));
    assertThat(male.getFullName(), is("Ms Lucy"));
  }
}