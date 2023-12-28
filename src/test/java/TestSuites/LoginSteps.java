package TestSuites;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import net.thucydides.core.annotations.Steps;

import Pages.BasePage;
import Pages.LoginPage;

public class LoginSteps{
	@Steps
	BasePage basePage;
	LoginPage loginPage;
	
	@Given("User launch browser with HRM application")
	public void userLaunchBrowserWithHRMApplication() {
		basePage.maximize();
	}

	@When("User enters Username")
	public void userEntersUsername() {
		loginPage.userEntersUsername();
	}

	@When("User enters password")
	public void userEntersPassword() {
		loginPage.userEntersPassword();
	}

	@When("User clicks on Login button")
	public void userClicksOnLoginButton() {
		loginPage.userClicksOnLoginButton();
	}
	
	@When("User enters Username $username")
	public void userEntersProvidedUsername(String  username) {
		loginPage.userEntersProvidedUsername(username);
	}

	@When("User enters password $password")
	public void userEntersProvidedPassword(String password) {
		loginPage.userEntersProvidedPassword(password);
	}
	
	@Then("verify login error message $errorMsg")
	public void verifyLoginErrorMessage(String message) {
		loginPage.verifyLoginErrorMessage(message);
	}
}
