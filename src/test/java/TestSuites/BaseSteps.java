package TestSuites;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.ScenarioType;

import Pages.BasePage;

public class BaseSteps {
	BasePage basePage;
	public static boolean isApplicationOpen=false;

	@BeforeStory
	public void beforeStory() {
		isApplicationOpen=false;

	}

	@BeforeScenario
	public void beforeEachScenario() {
		resetApplication();
	}

	@BeforeScenario(uponType = ScenarioType.EXAMPLE)
	public void beforeEachScenarioExample() {
		resetApplication();
	}

	public static void main(String[] args) {
		BaseSteps baseSteps = new BaseSteps();
	}

	private void resetApplication() {
		if(!isApplicationOpen) {
			System.out.println("+++++Reset Application method is running++++++");
			basePage.open();
			isApplicationOpen=true;
		}
		else {
			try {
				if(basePage.getTitle().equals("")) {
					System.out.println("+++++Reset Application method is running++++++");
					basePage.open();
					isApplicationOpen=true;
				}
			}
			catch(Exception e) {
				basePage.getDriver().quit();
			}
		}
	}

	@AfterScenario
	public void afterEachScenario() {
		basePage.getDriver().quit();
		System.out.println("++++++++ afterEachScenario method is running ++++++++");
	}

	@AfterScenario(uponType = ScenarioType.EXAMPLE)
	public void afterEachExampleScenario() {
		basePage.getDriver().quit();
		System.out.println("++++++++ afterEachExampleScenario method is running ++++++++");
	}

	@AfterScenario(uponOutcome = AfterScenario.Outcome.FAILURE)
	public void afterFailScenario() {
		System.out.println("++++++++ afterFailScenario method is running ++++++++");
	}

	@AfterScenario(uponOutcome = AfterScenario.Outcome.SUCCESS)
	public void afterSuccessScenario() {
		System.out.println("++++++++ afterSuccessScenario method is running ++++++++");
	}
	
	@AfterScenario(uponOutcome = AfterScenario.Outcome.ANY)
	public void afterAnyScenario() {
		System.out.println("++++++++ afterAnyScenario method is running ++++++++");
	}
}
