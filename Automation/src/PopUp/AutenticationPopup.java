package PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutenticationPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
