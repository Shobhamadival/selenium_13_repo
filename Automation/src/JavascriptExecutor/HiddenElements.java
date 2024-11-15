package JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://www.facebook.com/r.php");
JavascriptExecutor js=(JavascriptExecutor) driver;
WebElement gender = driver.findElement(By.id("custom_gender"));
js.executeScript("arguments[0].value='Good morning'", gender);
WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
js.executeScript("arguments[0].value='shobha'", name);
	}

}
