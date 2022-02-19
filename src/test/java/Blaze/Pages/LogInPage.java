package Blaze.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Blaze.Steps.ButtonPages;
import Blaze.Steps.Questions;

public class LogInPage {
	
	private ButtonPages buttonPages;
	private Questions questions;
	
	@FindBy(how = How.ID, using = "loginusername")
	private WebElement txtUserName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='loginpassword']")
	private WebElement txtPassword;
		
	
	@FindBy(how = How.XPATH, using = "//input[@id='loginpassword']")
	private WebElement prueba;
	
	// esto es un constructor 
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions(driver);
	}
	
	//esto es un metodo
	public void ingresar(String userName, String password) {
		buttonPages.btnLogIn();
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(password);
		questions.screenShot();
		buttonPages.btnLogIn2();
	}
}
