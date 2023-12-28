package TestSuites;

import net.serenitybdd.jbehave.SerenityStories;

public class TestRunner extends SerenityStories{
	public void testSuiteRunner() {
		System.setProperty("webdriver.driver", "chrome");
		System.setProperty("webdriver.base.url", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		findStoriesCalled("Login.story");
	}
}
