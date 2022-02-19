package Blaze.Definitions;

import org.openqa.selenium.WebDriver;

import Blaze.Pages.LogInPage;
import Blaze.Pages.SingUpPage;
import Blaze.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private SingUpPage singUpPage = new SingUpPage(driver);
	private LogInPage logInPage = new LogInPage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	
	@And("^al diligenciar los campos usuario (.*) y contraseña (.*)$")
	public void registrarme(String userName, String password) {
		this.singUpPage = new SingUpPage(driver);
		this.singUpPage.registroUser(userName, password);
	}

	@And("^diligenciar los campos usuario (.*) y contraseña (.*)$")
	public void ingresar(String userName, String password) {
		this.logInPage = new LogInPage(driver);
		this.logInPage.ingresar(userName, password);
	}
}