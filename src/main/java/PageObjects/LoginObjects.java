package PageObjects;

import org.openqa.selenium.By;

public interface LoginObjects {
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.xpath("//*[contains(@class,'login-button')]");
	By invalidCredError = By.className("oxd-alert-content oxd-alert-content--error");
	By usernameError = By.xpath("//*[@name='username']/../following-sibling::span");
	By passwordError = By.xpath("//*[@name='password']/../following-sibling::span");
}
