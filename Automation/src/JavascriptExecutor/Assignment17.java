package JavascriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.io.FileHandler;

public class Assignment17 {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

driver.get("https://www.abhibus.com/");
JavascriptExecutor js= (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,500)", args);
//js.executeScript("window.scrollTo(0,500)", args);

WebElement onlineBus = driver.findElement(By.xpath("//h2[text()='Online Bus Booking Services']"));
//Thread.sleep(2000);
js.executeScript("arguments[0].scrollIntoView(true)",onlineBus);

TakesScreenshot ts=(TakesScreenshot) driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("./Takesscreenshot/Assignment17.png");
FileHandler.copy(temp, dest);

	}

}
