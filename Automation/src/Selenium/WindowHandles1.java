package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/");
driver.findElement(By.linkText("Facebook")).click();
Set<String> allWindows = driver.getWindowHandles();
System.out.println(allWindows);
for(String id:allWindows) {
	System.out.println(id);
}
	}

}
