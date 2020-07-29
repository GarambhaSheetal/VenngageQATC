package pages;

import org.openqa.selenium.WebDriver;
import objects.Account;
import utils.Selenium;

public class SignUpPage extends Selenium{

	private WebDriver driver;
	private Selenium selenium;

	// Add XPaths here
	private static final String firstNameInput = "/html/body/div[1]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/input";
	private static final String lastNameInput = "//input[@id='user_last_name']";
	private static final String emailInput = "//div/input[@id='user_email']";
	private static final String passwordInput = "//div/input[@id='user_password']";
	private static final String Sign_UpButton = "//div/button[@id='btn_register']";


	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		selenium = new Selenium();
		
	}

	// Create a function that takes an Account and simulates signing up using
	// Selenium actions. (Refer to Selenium.java)

	public void fillUpSignUpForm(Account a) throws InterruptedException {
		
        selenium.sendKeys(firstNameInput, a.getFirstname());
        selenium.sendKeys(lastNameInput, a.getLastname());
        selenium.sendKeys(emailInput, a.getEmail());
        selenium.sendKeys(passwordInput, a.getPassword());
        selenium.clickByXpath(Sign_UpButton);
        System.out.println("Sucessfully regiestered");
        
		
	}
}