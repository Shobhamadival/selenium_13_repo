package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tolearnquit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
Thread.sleep(5000);//after typing click on it pop up msg will display click on throw
driver.findElement(By.id("browserButton3")).click();
		driver.quit();
	}

}