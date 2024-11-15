package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssignmentTestScript extends AssignmentBaseClass {

	@Test
	public void clickonSales() {
		driver.findElement(By.xpath("//span[text()='Sales']")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "SkillRary Ecommerce";
		if(actualTitle.equals(expectedTitle)) {
			Reporter.log("Sales history is displayed",true);
		}else {
			Reporter.log("sales history is not displayed",true);
		}
	}

	}


