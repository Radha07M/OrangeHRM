package Pages;

import PageObjects.LoginObjects;
import Utilities.Constants;

public class LoginPage extends BasePage implements LoginObjects {
	
	public void userEntersUsername() {
		element(username).waitUntilVisible().sendKeys(Constants.USERNAME);
	}

	public void userEntersPassword() {
		element(password).waitUntilVisible().sendKeys(Constants.PASSWORD);
	}

	public void userClicksOnLoginButton() {
		element(loginButton).waitUntilClickable().click();
	}
	
	public void userEntersProvidedUsername(String username1) {
		element(username).waitUntilVisible().sendKeys(username1);
	}

	public void userEntersProvidedPassword(String password1) {
		element(password).waitUntilVisible().sendKeys(password1);
	}
	
	public void verifyLoginErrorMessage(String message) {
		waitFor(5);
		element(invalidCredError).waitUntilVisible().containsText(message);
	}
	
	public void verifyLoginFieldsErrorMessage(String message) {
		element(usernameError).waitUntilVisible().containsText(message);
		element(passwordError).waitUntilVisible().containsText(message);
	}
}
