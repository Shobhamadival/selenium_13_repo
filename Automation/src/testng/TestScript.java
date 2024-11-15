package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass {
@Test
public void clickonBooks() {
	driver.findElement(By.partialLinkText("Books")).click();
	String actualTitle = driver.getTitle();
	String expectedTitle = workbook.getSheet("Sheet3").getRow(1).getCell(0).getStringCellValue();
	if(actualTitle.equals(expectedTitle)) {
		Reporter.log("Books page is displayed",true);
	}else {
		Reporter.log("Books page is not displayed",true);
	}
	
	
}
	
	
	
	
	
	
}
