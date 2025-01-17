package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	
	//instead of storing datas in braces we can use this logic
@Test(dataProviderClass = DataStorage.class,dataProvider = "loginData")
public void login(String[] cred) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.findElement(By.id("email")).sendKeys(cred[0]);
	driver.findElement(By.id("password")).sendKeys(cred[1]);
	driver.findElement(By.id("last")).click();
	Assert.assertEquals(driver.getTitle(),"SkillRary Ecommerce","user failed to login");
	Reporter.log("user logged in successfully",true);
}
}
