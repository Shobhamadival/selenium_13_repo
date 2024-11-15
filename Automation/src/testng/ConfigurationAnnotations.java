package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("@beforesuite",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("@beforeTest",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("@beforeClass",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("@beforeMethod",true);
	}
	
@Test
public void demo() {
	Reporter.log("@test demo test case executed",true);
}

@Test
public void sample() {
	Reporter.log("sample test case",true);
}

@AfterMethod
public void afterMethod() {
	Reporter.log("@afterMethod",true);
}

@AfterClass
public void afterClass() {
	Reporter.log("@afterClass",true);
}

@AfterTest
public void afterTest() {
	Reporter.log("@afterTest",true);
}

@AfterSuite
public void afterSuite() {
	Reporter.log("@aftersuite",true);
}
}