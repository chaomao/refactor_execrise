package com.thoughtworks;

enum Gender {MALE, FEMALE}

public class Person {
  private Gender gender;
  private String name;
  private String officeAreaCode;
  private String officeNumber;

  public Person(String name, String officeAreaCode, String officeNumber, Gender gender) {
    this.name = name;
    this.officeAreaCode = officeAreaCode;
    this.officeNumber = officeNumber;
    this.gender = gender;
  }


  public String getTelephoneNumber() {
    return "+" + officeAreaCode + "-" + officeNumber;
  }

  public String getFullName() {
    return (gender == Gender.MALE ? "Mr " : "Ms ") + name;
  }
}
