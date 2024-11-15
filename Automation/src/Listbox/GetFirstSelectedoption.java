package Listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedoption {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapp.skillrary.com/");
WebElement priceListbox = driver.findElement(By.id("cars"));
Select priceSelect=new Select(priceListbox);
priceSelect.selectByIndex(2);
priceSelect.selectByIndex(0);
priceSelect.selectByIndex(1);

WebElement selectedOption = priceSelect.getFirstSelectedOption();
System.out.println(selectedOption.getText());
//getallselectedoptions starts from 
List<WebElement> allselectedOptions = priceSelect.getAllSelectedOptions();
System.out.println(allselectedOptions.size());

for(WebElement ele:allselectedOptions) {
	System.out.println(ele.getText());
}
	}

}
