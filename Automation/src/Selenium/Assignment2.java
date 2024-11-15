package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTF = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		usernameTF.clear();
		Thread.sleep(2000);
		usernameTF.sendKeys("testing");
		WebElement passwordTF = driver.findElement(By.id("password"));
		passwordTF.clear();
		Thread.sleep(2000);
		passwordTF.sendKeys("987656432");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
	}

}
