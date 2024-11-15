package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapps.qspiders.com/");
driver.findElement(By.partialLinkText("UI Testing Concepts")).click();

driver.findElement(By.partialLinkText("Button")).click();
driver.findElement(By.linkText("Right Click")).click();
Actions act=new Actions(driver);
WebElement clickButton = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
act.contextClick(clickButton).perform();
driver.findElement(By.xpath("//div[text()='Yes']")).click();
WebElement click = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
String result = click.getText();
System.out.println(result);
String colour = click.getCssValue("color");
System.out.println(colour);

	}

}
