package Datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//step 1: create FIS object
		FileInputStream fis=new FileInputStream("./TestData/testdata.xlsx");
		
		//step 2: create respective type object
		Workbook Workbook = WorkbookFactory.create(fis);
		
		//step 3: call read methods
String url = Workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		
		//for username call read method
		String username = Workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		//password
		String password = Workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);
		//expected result
		String result = Workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(result);

		double price = Workbook.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		System.out.println(price);
		
		boolean status = Workbook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(status);
		
		LocalDateTime date = Workbook.getSheet("Sheet1").getRow(1).getCell(6).getLocalDateTimeCellValue();
		System.out.println(date);
		
		
		
		
		//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get(url);
		//driver.findElement(By.linkText("LOGIN")).click();
		//driver.findElement(By.id("email")).sendKeys(username);
		//Thread.sleep(2000);
		//driver.findElement(By.id("password")).sendKeys(password);
		
		//driver.quit();
		
		
		
		
		
		
		
		
	
	}

}
