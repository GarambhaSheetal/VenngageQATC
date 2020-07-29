package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Selenium;

public class IndividualTemplatesPage {

	private WebDriver driver;
	private Selenium selenium;
	
	// Add XPaths here
	private static final String template = "//div[@class ='templates__hoverSettings--1IH_r undefined templates__hidden--3pfUu']";
	private static final String SignUpButton = "(//button[@class='templates__signUp--2DvEL'])[1]";
	
	
	public IndividualTemplatesPage(WebDriver driver){
		this.driver = driver;
		selenium = new Selenium();
	}
	
	// Create a function that clicks on the Sign Up button
	public void clickOnSignUpButton()
	{
		List<WebElement> templates = driver.findElements(By.xpath(template));
        WebElement element = templates.get(1);
        selenium.mouseHowerOverElement(element);
        selenium.clickByXpath(SignUpButton);
        System.out.println("Redirected to SignUp page");
	}
	

}