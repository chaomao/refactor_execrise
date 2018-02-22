package com.thoughtworks;

public class UnsupportCityException extends RuntimeException {
  public UnsupportCityException(String message) {
    super(message);
  }
}
