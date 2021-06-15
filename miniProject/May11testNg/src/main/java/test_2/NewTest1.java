package test_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
	@BeforeSuite
	  public void beforeSuite() {
		  System.out.println("hello1");
	  }
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("hello2");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("hello3");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("hello4");
	  }
  @Test
  public void f() {
	  System.out.println("hello5");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("hello6");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("hello7");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("hello8");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("hello9");
  }

}
