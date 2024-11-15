package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytext {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/");
//driver.findElement(By.xpath("//span[text]='Shopping cart']")).click();
//driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
driver.findElement(By.xpath("//a[text()='Log in']")).click();
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("abc12@gmail.com");
driver.findElement(By.xpath("//input[@class='password']")).sendKeys("123456");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	}

}
