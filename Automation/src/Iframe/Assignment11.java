package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment11 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://petdiseasealerts.org/forecast-map/#/");
WebElement mapFrame = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
driver.switchTo().frame(mapFrame);
driver.findElement(By.name("Montana")).click();
driver.switchTo().defaultContent();
driver.findElement(By.partialLinkText("SIGN UP")).click();
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("shob15@gmail.com");
driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("152900");
driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("152900");
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shob");
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("shobs");
driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
WebElement user = driver.findElement(By.id("user-type"));
Select listbox=new Select(user);
listbox.selectByValue("3");
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	WebElement password = driver.findElement(By.xpath("Passwords do not match."));
	//String result = password.getText();
	System.out.println(password.getText());
	
	}

}
