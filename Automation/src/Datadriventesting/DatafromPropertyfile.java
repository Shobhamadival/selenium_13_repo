package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatafromPropertyfile {

	public static void main(String[] args) throws IOException {
//step 1:create object for fileinputstream
		FileInputStream fis=new FileInputStream("./TestData/demoappskillary.properties");
		
		//step 2: create respective file type object
		Properties prop=new Properties();
		
		//step 3: call read methods
		prop.load(fis);
		String url = prop.getProperty("url");
		String name = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		System.out.println(url);
		System.out.println(name);
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(password);
		
		
	}

}
