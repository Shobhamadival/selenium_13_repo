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
import org.openqa.selenium.io.FileHandler;

public class Assignment18 {

	public static void main(String[] args) throws IOException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://demoapp.skillrary.com/");
WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].value='holiday'", text);
TakesScreenshot ts=(TakesScreenshot) driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("./Takesscreenshot/Assignment18.png");
FileHandler.copy(temp, dest);

	}

}
