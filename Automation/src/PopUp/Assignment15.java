package PopUp;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment15 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/22");
		//driver.findElement(By.xpath("//button[@id='compare']")).click();
		driver.findElement(By.id("compare")).click();

		Set<String> allwindowIds = driver.getWindowHandles();//capture all child window ids
		
		for(String id:allwindowIds) {
			driver.switchTo().window(id);//switch to any window
			String url = driver.getCurrentUrl();//capture url
			if(url.contains("Amazon")) {//compare url
				break;
			}
			Actions act=new Actions(driver);
		//	act.scrollToElement().perform();
			act.scrollByAmount(300, 500).perform();
			Thread.sleep(2000);
			act.scrollByAmount(300, 500).perform();//to go forward we can use this

			TakesScreenshot ts=(TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Takesscreenshot/Assignment15.png");
			FileHandler.copy(temp, dest);
		
	}

}
}