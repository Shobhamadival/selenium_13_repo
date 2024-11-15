package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SeleniumTest {

	private static OutputType OutputType;
	private static Object File;

	public static void main(String[] args) throws IOException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://demo.vtiger.com/vtigercrm/");
TakesScreenshot ts=(TakesScreenshot)driver;
  File temp = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./TakesScreenshot/SeleniumTest.png");
		 FileHandler.copy(temp, dest);
		 
		 driver.findElement(By.linkText("Vtiger")).click();
		 
		
			 
			 
		 
		 Set<String> ids1 = driver.getWindowHandles();
		 for(String Id: ids1) {
			 driver.switchTo().window(Id);
			 System.out.println(driver.getTitle());
			 if(driver.getTitle().contains("CRM Software: Customer Relationship Management | Vtiger CRM"))
				 break;
			 
		 }
			 WebElement company = driver.findElement(By.linkText("Company"));
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(company).perform();
		 
		 driver.findElement(By.partialLinkText("Contact Us")).click();
		 driver.findElement(By.linkText("+91 9243602352")).getText();
		 
		 
		 
		 
		 
	}

}
