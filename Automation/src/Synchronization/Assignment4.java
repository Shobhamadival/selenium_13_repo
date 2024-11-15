package Synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment4 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.partialLinkText("UI Testing Concepts")).click();
		driver.findElement(By.linkText("Web Table")).click();
		
driver.findElement(By.linkText("Dynamic Web Table")).click();
		  WebElement apple = driver.findElement(By.xpath("(//td[contains(@class,'px-6 py-4 font-bold text-black')])[3]"));
		  System.out.println(apple.getText());
		  TakesScreenshot ts=(TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./Takesscreenshot/screenshot.png");
			FileHandler.copy(temp, dest);
	}

}
