package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryPage {
//declaration
	@FindBy(id = "navbar-search-input")
	private WebElement searchTextField;
	
	//intialization
	public SkillaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//getters

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
}
