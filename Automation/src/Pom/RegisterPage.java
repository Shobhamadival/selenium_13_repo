package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
//declaration
	@FindBy(linkText = "Register")
	private WebElement register;
	
	@FindBy(linkText = "First name")
	private WebElement firstnameTextField;
	
	@FindBy(linkText = "Last name")
	private WebElement lastnameTextField;
	
	@FindBy(id ="Email")
	private WebElement emailTextField;
	
	@FindBy(linkText = "gender-female")
	private WebElement genderCheckBox;
	
	@FindBy(name = "Password")
	private WebElement passwordTextField;
	
	@FindBy(linkText = "Confirm password")
	private WebElement conformTextField;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	//intialization
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstnameTextField() {
		return firstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getGenderCheckBox() {
		return genderCheckBox;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConformTextField() {
		return conformTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
}
