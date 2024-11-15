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

public class Assignment8 {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapps.qspiders.com/");
driver.findElement(By.partialLinkText("UI Testing Concepts")).click();
driver.findElement(By.partialLinkText("Button")).click();
driver.findElement(By.linkText("Double Click")).click();
Actions act=new Actions(driver);
WebElement button = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
act.doubleClick(button).perform();
TakesScreenshot ts=(TakesScreenshot) driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("./Takesscreenshot/Assignment8.png");
FileHandler.copy(temp, dest);



	}

}
