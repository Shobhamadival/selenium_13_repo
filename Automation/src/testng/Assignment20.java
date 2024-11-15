package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment20 {
@Test(priority=0,invocationCount = 2)
public void createAccount() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://demowebshop.tricentis.com/login");
	Reporter.log("created account successful",true);
}
	@Test(priority=2)
	public void deleteAccount() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("deleted account successful",true);
		
	}
	@Test(priority=1,invocationCount = 3,threadPoolSize = 3)
	public void editAccount() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("edited account successful",true);
		
		
	
	
	
	
	
}
}
