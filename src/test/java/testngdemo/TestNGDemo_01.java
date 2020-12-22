package testngdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGDemo_01 {
  @Test(groups= {"smoke"})
  public void test001() {
	  System.out.println("Inside @Test001 Annotation");
  }
  
  @Test(groups= {"smoke"})
  public void pest001() {
	  System.out.println("Inside @Pest001 Annotation");
  }
  
  @Test(groups= {"smoke"})
  public void qest001() {
	  System.out.println("Inside @Qest001 Annotation");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside @BeforeMethod Annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside @AfterMethod Annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside @BeforeClass Annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside @AfterClass Annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside @BeforeTest Annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside @AfterTest Annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside @BeforeSuite Annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside @AfterSuite Annotation");
  }

}
