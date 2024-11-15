package crossBrowserTesting;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptCrossBrowser extends BaseCrossBrowser {
@Test
public void clickOnSales() {
	driver.findElement(By.xpath("//span[text()='Sales']")).click();
	String actualTitle = driver.getTitle();
	String expectedTitle = "SkillRary Ecommerce";
	if(actualTitle.equals(expectedTitle)) {
		Reporter.log("sales page is displayed",true);
	}else {
		Reporter.log("sales page is not displyed",true);
	}
	
}
}
