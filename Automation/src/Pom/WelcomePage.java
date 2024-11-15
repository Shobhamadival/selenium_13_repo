package Pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class WelcomePage {
//declaration
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	

	
	//intialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//getters

	public WebElement getRegisterLink() {
		return registerLink;
	}
}
