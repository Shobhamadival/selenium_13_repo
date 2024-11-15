package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmwnt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(20000);
		driver.findElement(By.linkText("Facebook")).click();
		switchtowindow(driver,"Facebook");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("See more on Facebook")) {
			System.out.println("");
		}
		
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
