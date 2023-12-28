package Pages;

import org.junit.Assert;

import PageObjects.CommonObjects;

public class CommonMethods extends BasePage implements CommonObjects {
	public void verifyPageTitleOfHRMApplication(String title) {
		Assert.assertEquals("Header Breadcrumb is not matching",element(pageTitle).getText().trim(),title);
	}
}
