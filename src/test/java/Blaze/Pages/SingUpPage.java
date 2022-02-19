package Blaze.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Blaze.Steps.ButtonPages;

public class SingUpPage {

	private ButtonPages buttonPages;
	
	@FindBy(how = How.ID, using = "sign-username")
	private WebElement txtUserName;
	
	@FindBy(how = How.XPATH, using = "//input[@type= 'password']")
	private WebElement txtPassword;
	
	// Esto es un constructor
	public SingUpPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	this.buttonPages = new ButtonPages(driver);
	}
	
	//esto es un metodo
	public void registroUser(String userName, String password) {
		buttonPages.btnSigUp();
		txtUserName.isDisplayed();
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(password);
		buttonPages.btnRegister();
	}
	
	
}
