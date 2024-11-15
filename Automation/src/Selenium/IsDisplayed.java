package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

System.out.println("display status:"+loginButton.isDisplayed());
System.out.println("enable status:"+loginButton.isEnabled());

	}

}
