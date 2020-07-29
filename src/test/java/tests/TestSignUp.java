package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Account;
import pages.IndividualTemplatesPage;
import pages.SignUpPage;
import utils.Selenium;

public class TestSignUp extends Selenium {

	private Account account;
	private SignUpPage signUpPage;
	private IndividualTemplatesPage templatesPage;
	
	@BeforeClass
	public void setup() {

		Selenium.init_Configuration();
		account = new Account("QA","Test","qa.121@test.com","123456");
		signUpPage = new SignUpPage(driver);
		templatesPage = new IndividualTemplatesPage(driver);
		

	}

	@Test
	public void testSignUp() {
		// Write test steps here
		try {
			templatesPage.clickOnSignUpButton();
			signUpPage.fillUpSignUpForm(account);
			String expectedUrl = "https://infograph.venngage.com/onboarding";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterClass
	public void tearDown() {
		if (Selenium.driver != null) {
			Selenium.tear_Down();
		}
	}

}
