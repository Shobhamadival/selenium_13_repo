package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
WebElement addIcon = driver.findElement(By.id("add"));
//WebElement addIcon = driver.findElement(By.id("minus"));
Actions act=new Actions(driver);
act.doubleClick(addIcon).perform();
act.doubleClick(addIcon).perform();
	}

}
