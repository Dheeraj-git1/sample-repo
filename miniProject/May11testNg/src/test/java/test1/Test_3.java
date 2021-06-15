package test1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.TestNG;

public class Test_3 {
	public static void main(String[] args) {
		TestNG t = new TestNG();
		List<String> l =new ArrayList<String>();
		String p = System.getProperty("user.dir")+"/testng.xml";
		l.add(p);
		t.setTestSuites(l);
		t.run();
		String  r="dhee";
		String v = "dhee";
		Assert.assertEquals(v,r,"gjf");
	}

}
