package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNg {//TestNG classs
@Test
public void sample() {
	Reporter.log("sample testcase executed",true);
}

@Test
public void demo() {//test case
	//test steps
	Reporter.log("demo testcase executed",true);
	//Reporter.log("welcome to advance selenium",true);
}

@Test
public void add() {
	Reporter.log("add test case executed",true);
}
}
