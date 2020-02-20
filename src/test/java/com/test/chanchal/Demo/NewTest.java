package com.test.chanchal.Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, String k) {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test Before Method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Test After Method annotation");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a","c" },
      new Object[] { 2, "b" ,"d"},
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Test Before class annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Test After class annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Test Before Test annotation");
  }
  
  @Test(priority=2)
  public void Testmethod() {
  
	  System.out.println("Test Test annotation having priority 2 set ");  
  }
  
  @Test(priority=1)
  public void Testmethod2() {
  
	  System.out.println("Test Test annotation having priority 1 set ");  
  
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("Test After Test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Test beforeSuite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Test AfterSuite annotation");
	  
  }

}
