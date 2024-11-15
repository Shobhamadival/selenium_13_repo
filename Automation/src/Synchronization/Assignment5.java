package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		String msg = driver.findElement(By.xpath("//p[@class='content']")).getText();
		System.out.println(msg);
		driver.findElement(By.linkText("Log in")).click();
	}

}
