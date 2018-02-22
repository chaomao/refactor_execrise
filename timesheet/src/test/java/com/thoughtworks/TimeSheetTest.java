package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TimeSheetTest {
  private TimeSheet timesheet;

  @Before
  public void setUp() throws Exception {
    timesheet = new TimeSheet();
  }

  @Test
  public void normalEmployeeReturnRate() throws Exception {
    Employee employee = new Employee(false, 100, "JIM", "IT");
    assertThat(timesheet.charge(employee, 1), is(100));
  }

  @Test
  public void specialEmployeeReturnDoubleRate() throws Exception {
    Employee employee = new Employee(true, 100, "BILL", "IT");
    assertThat(timesheet.charge(employee, 1), is(200));
  }

  @Test
  public void getNameForEmployee() {
    assertThat(new Employee(false, 100, "name", "dt").getName(), is("name"));
  }

  @Test
  public void getDepartmentForEmployee() {
    assertThat(new Employee(false, 100, "name", "dt").getDepartment(), is("dt"));
  }
}