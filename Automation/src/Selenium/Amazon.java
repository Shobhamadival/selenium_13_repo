package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		//driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("9876554321");
		driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();
	}

}