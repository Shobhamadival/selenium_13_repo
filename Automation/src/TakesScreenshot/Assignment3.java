package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment3 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Mobiles",Keys.ENTER);
		
		 TakesScreenshot ts=(TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./Takesscreenshot/Mobile.png");
			FileHandler.copy(temp, dest);
		
		
	}

}
