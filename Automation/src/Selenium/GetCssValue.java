package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	 WebElement errorMS = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		String color = errorMS.getCssValue("color");
		String fontfamily = errorMS.getCssValue("font-family");
		String fontsize = errorMS.getCssValue("font-size");
		
		System.out.println(color);
		System.out.println(fontfamily);
		System.out.println(fontsize);
		
		
	}

}
