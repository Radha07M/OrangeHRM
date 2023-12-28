package TestSuites;

import org.jbehave.core.annotations.Then;

import Pages.CommonMethods;

public class CommonSteps {
	CommonMethods commonPage;
	
	@Then("verify page title $title of HRM application")
	public void verifyPageTitleOfHRMApplication(String title) {
		commonPage.verifyPageTitleOfHRMApplication(title);
	}
}
