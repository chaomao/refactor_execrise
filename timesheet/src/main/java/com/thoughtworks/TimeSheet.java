package com.thoughtworks;

public class TimeSheet {
  
  public int charge(Employee employee, int days){
    int base = employee.getRate() * days;
    if (employee.hasSpecialSkill()) {
      return base * 2;
    }
    else {
      return base;
    }
  }
}

class Employee{
  private boolean specialSkill;
  private int rate;
  private String name;
  private String department;

  Employee(boolean specialSkill, int rate, String name, String department) {
    this.specialSkill = specialSkill;
    this.rate = rate;
    this.name = name;
    this.department = department;
  }

  public int getRate() {
    return this.rate;
  }

  public boolean hasSpecialSkill() {
    return this.specialSkill;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }
}