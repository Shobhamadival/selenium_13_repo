package Listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultipleSelect {

	private static WebElement priceListbox;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement priceListdown = driver.findElement(By.id("cars"));
		Select priceSelect=new Select(priceListdown);
		priceSelect.selectByIndex(0);
		priceSelect.selectByValue("299");
		priceSelect.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		
		Thread.sleep(2000);
		priceSelect.deselectAll();
		
		System.out.println(priceSelect.isMultiple());
	}

}
