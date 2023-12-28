package Pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {
	public BasePage() {
		
	}
	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public void maximize() {
		getDriver().manage().window().maximize();
	}
	
}
