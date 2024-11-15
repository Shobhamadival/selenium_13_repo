package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TolearnSingleSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.facebook.com/reg/?next=%2FropCommerce");
WebElement monthDropdown = driver.findElement(By.id("month"));

Select monthSelect=new Select(monthDropdown);
//monthSelect.selectByIndex(5);
//monthSelect.selectByValue("4");
monthSelect.selectByVisibleText("Dec");

WebElement yearDropdown = driver.findElement(By.id("year"));
Select yearSelect=new Select(yearDropdown);
yearSelect.selectByIndex(2001);
System.out.println(yearSelect.isMultiple());



	}

}
