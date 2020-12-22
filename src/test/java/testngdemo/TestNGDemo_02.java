package testngdemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class TestNGDemo_02 {
	@Test(priority=2,dependsOnMethods= {"test01"},groups= {"smoke"})
	public void test03() {
		Reporter.log("Inside Test03", true);
	}
	@Test(priority=1,groups= {"smoke"})
	public void test01() {
		Reporter.log("Inside Test01", true);
	}
	@Test(priority=3,groups= {"smoke"})
	public void test02() {
		Reporter.log("Inside Test02", true);
	}
}
