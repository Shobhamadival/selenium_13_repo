package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Product']")).sendKeys("selenium",Keys.ENTER);
		driver.findElement(By.xpath("//b[text()='Selenium']")).click();
		WebElement icon = driver.findElement(By.id("add"));
		Actions act=new Actions(driver);
		act.moveByOffset(178, 483).perform();
		Thread.sleep(2000);
		act.doubleClick(icon).perform();
		
		
	}

}
