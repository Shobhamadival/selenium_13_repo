package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment10 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
driver.get("https://www.myntra.com/");
WebElement link = driver.findElement(By.partialLinkText("KIDS"));
Actions act=new Actions(driver);
act.moveToElement(link).perform();
Thread.sleep(2000);
driver.findElement(By.linkText("Ethnic Wear")).click();
if(driver.getCurrentUrl().equals("https://www.myntra.com/ki-etnhc?f=Gender%3Aboys%2Cboys%20girls&plaEnabled=false"))
 System.out.println("ethnic wear page is loaded");
 else
	System.out.println("ethnic wear page is not loaded");
TakesScreenshot ts=(TakesScreenshot) driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("./Takesscreenshot/Assignment10.png");
FileHandler.copy(temp, dest);


	}

}
