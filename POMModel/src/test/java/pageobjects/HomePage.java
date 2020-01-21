package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilitites.TestBase;

public class HomePage extends TestBase {

	public static final By ZIPCODE_TEXTFIELD = By.xpath("//html/body/div[1]/section[1]/div[1]/div[1]/div/div/form/div[1]/div/div/div/input");
	public static final By GETPRICING_BUTTON = By.xpath("/html/body/div[1]/section[1]/div[1]/div[1]/div/div/form/div[2]/button");

	/**
	 * Constructor
	 * 
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Method to enter Zipcode
	 * 
	 * @param driver
	 */
	public void setZipCode(WebDriver driver, String zipCode) {
		waitForExpectedElement(driver, ZIPCODE_TEXTFIELD);
		driver.findElement(ZIPCODE_TEXTFIELD).sendKeys(zipCode);

	}
	/**
	 * Method to Click Get Pricing button
	 * 
	 * @param driver
	 */
	public void clickGetPricingButton(WebDriver driver) {
		waitForExpectedElement(driver, GETPRICING_BUTTON);
		driver.findElement(GETPRICING_BUTTON).click();
	}

}
