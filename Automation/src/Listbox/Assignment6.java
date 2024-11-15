package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.freshersworld.com/");
String title = driver.getTitle();
if(title.equals("Jobs: Search Jobs In India, Freshers Jobs Online, Govt Jobs, Recruitment | Freshersworld.com"))
	System.out.println("Register now page is visible");
else
	System.out.println("Register now page is not visible");
driver.findElement(By.linkText("REGISTER NOW")).click();
WebElement loc = driver.findElement(By.id("currentCity"));
Select locdropdown=new Select(loc);
locdropdown.selectByVisibleText("Bangalore");
WebElement qualfi = driver.findElement(By.id("course"));
Select quadropdown=new Select(qualfi);
quadropdown.selectByVisibleText("BE/B.Tech");



	}

}
