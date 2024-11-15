package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetREctangle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/");
Rectangle rect = driver.findElement(By.id("small-searchterms")).getRect();

System.out.println("height: "+rect.getHeight());
System.out.println("width: "+rect.getWidth());
System.out.println("x: "+rect.getX());
System.out.println("y:"+rect.getY());

	}

}
