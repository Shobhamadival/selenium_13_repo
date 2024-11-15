package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependentandindependent {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/152");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();	
		switchtowindow(driver,"flipkart");
		Point flipkartposition = driver.manage().window().getPosition();
		switchtowindow(driver,"ebay");
		Point ebayposition = driver.manage().window().getPosition();
		driver.manage().window().setPosition(flipkartposition);
		switchtowindow(driver, "flipkart");
		driver.manage().window().setPosition(ebayposition);
	}

	private static void switchtowindow(WebDriver driver, String url) {
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String id : allwindowIds) {
			driver.switchTo().window(id);
		String acturl = driver.getCurrentUrl();
		if(acturl.contains(url)) {
			break;
		}
		}
	}

}
