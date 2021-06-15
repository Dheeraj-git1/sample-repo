package test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test_2 extends Test_may11{
	@BeforeMethod
	public void before() {
		System.out.println("before");
	}
	@AfterMethod
	public void after() {
		System.out.println("after");
	}
	@Test
	public void TC02() {
		System.out.println("Tc02");
		
	}

}
