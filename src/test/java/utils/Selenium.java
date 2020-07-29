package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author atitpatel
 *
 */
public class Selenium {

	// Assume that the WebDriver manages browser actions.
	public static WebDriver driver;
	public static String path = System.getProperty("user.dir");
	public WebDriverWait wait;
	public static String url = "https://venngage.com/templates";

	

	/**
	 * Setup webdriver object 
	 */
	public static void init_Configuration() {

		try {
			System.setProperty("webdriver.chrome.driver", path + "/Drivers/ChromeDriver/chromedriver");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			goToUrl(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}



	/**
	 * Navigate to specified URL.
	 * 
	 * @param url to navigate to.
	 **/
	public static void goToUrl(String url) {
		driver.get(url);
	}

	/**
	 * Simulates typing keys into the specified xpath
	 *
	 * @param xpath xpath of text field to send keys to
	 * @param keys  keys to send to xpath
	 */
	public void sendKeys(String xpath, String keys) {
		driver.findElement(By.xpath(xpath)).sendKeys(keys);
	}

	/**
	 * Clicks the specified xpath. Assume that the click function simulates a left
	 * mouse click.
	 *
	 * @param xpath xpath to click
	 */
	public void clickByXpath(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	
	/**
	 * Perform mouse hover the element
	 * @param xpath
	 */
	public void mouseHowerOverElement(WebElement element) {
		boolean flag = false;
		try {
			new Actions(driver).moveToElement(element).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				System.out.println(" MouserOver Action is performed on ");
			} else {
				System.out.println("MouseOver action is not performed on");
			}
		}

	}
	
	
	
	/**
	 *  Close the all browser instances
	 */
	public static void tear_Down() {

		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

}