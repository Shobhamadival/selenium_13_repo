package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datafrompropertyfile2 {

	public static void main(String[] args) throws IOException {
		//step 1:create object for fileinputstream
				FileInputStream fis=new FileInputStream("./Testdata/CommonData.properties");
				
				//step 2: create respective file type object
				Properties prop=new Properties();
				
				//step 3: call read methods
				prop.load(fis);
				String url1 = prop.getProperty("url1");
				//String name = prop.getProperty("");
				String password1 = prop.getProperty("password1");
				String email1 = prop.getProperty("Email");
				
				System.out.println(url1);
				System.out.println(password1);
				System.out.println(email1);
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				
				driver.get(url1);
				driver.findElement(By.id("Email")).sendKeys(email1);
				driver.findElement(By.id("Password")).sendKeys(password1);
				
				
				
				
				
				
				
	}

}
