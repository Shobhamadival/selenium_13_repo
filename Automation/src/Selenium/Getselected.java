package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getselected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
WebElement goodRadioButton = driver.findElement(By.xpath("//label[text()='Good']/..//input[@type='radio']"));
System.out.println("-----before clicking-----");
System.out.println(goodRadioButton.isSelected());

goodRadioButton.click();
System.out.println("-----after clicking-----");
System.out.println(goodRadioButton.isSelected());
	}

}
