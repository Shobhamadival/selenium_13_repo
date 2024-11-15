package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.get("https://demowebshop.tricentis.com/");

//WelcomePage wp=new WelcomePage(driver);
//wp.getRegisterLink().click();

LoginPage lp=new LoginPage(driver);
lp.getLogIn().click();
lp.getEmailTextField().sendKeys("shob123@gmail.com");
lp.getPasswordTextField().sendKeys("12345678");
lp.getLoginButton();

//calling getter method() of register link






	}

}
