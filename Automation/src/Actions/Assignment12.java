package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment12 {

	public static void main(String[] args) throws IOException, InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
WebElement photoframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
driver.switchTo().frame(photoframe);
WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));

WebElement trash = driver.findElement(By.id("trash"));
Actions act=new Actions(driver);
act.dragAndDrop(image1, trash).perform();
act.dragAndDrop(image2, trash).perform();
driver.switchTo().defaultContent();
driver.findElement(By.linkText("CHEATSHEETS")).click();
//Actions act1=new Actions(driver);
//act1.click(sheet).perform();

 driver.findElement(By.linkText("SQL Cheat Sheet")).click();
 WebElement slideShow = driver.findElement(By.xpath("(//ul[@class='wp-block-jetpack-slideshow_swiper-wrapper swiper-wrapper'])[2]"));
 Actions act1=new Actions(driver);
 act.scrollToElement(slideShow).perform();
act.scrollByAmount(0, 500).perform();
Thread.sleep(2000);
act.scrollByAmount(0, 400).perform();

TakesScreenshot ts=(TakesScreenshot) driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File dest = new File("./Takesscreenshot/Assignment12.png");
FileHandler.copy(temp, dest);









	}

}
