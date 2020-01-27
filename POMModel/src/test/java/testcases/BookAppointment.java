package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import pageobjects.CheckOutPage;
import pageobjects.HomePage;
import pageobjects.SelectPlanPage;
import pageobjects.ServicesPage;
import utilitites.TestBase;

public class BookAppointment extends TestBase {

	HomePage homePage = new HomePage(driver);
	SelectPlanPage selectplan = new SelectPlanPage(driver);
	ServicesPage servicesPage = new ServicesPage(driver);
	CheckOutPage checkOutPage = new CheckOutPage(driver);
	
	@BeforeClass
	public void setUp() throws IOException {
		driver = launchBrowser();
	}

	@Test(priority = 1)
	public void getpricing() {
		try {
			test = reports.startTest("Verify Homepage");
			test.log(LogStatus.INFO, "Open Home page");
			Assert.assertEquals(getPageTitle(driver), "Makespace Storage | Never visit a self-storage unit again!");
			homePage.setZipCode(driver, "10038");
			test.log(LogStatus.INFO, "Enter zipcode");
			homePage.clickGetPricingButton(driver);
			test.log(LogStatus.INFO, "Clicked on Pricing button"); 
		} catch (Exception ex) {
			test.log(LogStatus.FAIL, "Exception is : " + ex.getLocalizedMessage());
		}
	}

	@Test(priority = 2)
	public void selectPlan() {
		try {
			test = reports.startTest(" Verify SelectPlan");
			test.log(LogStatus.INFO, "Open Select Plan");
			selectplan.clickSelectPlanButton(driver);
			test.log(LogStatus.INFO, "Clicked on SelectPlan Button");
			selectplan.setBinValue(driver, "4");
			test.log(LogStatus.INFO, "Entered Bin value in Input Textbox");
			selectplan.clickContinueButton(driver);
			test.log(LogStatus.INFO, "Clicked on Continue Button");
			selectplan.clickGotItButton(driver);
			test.log(LogStatus.INFO, "Clicked on GotIt Button");
		} catch (Exception ex) {
			test.log(LogStatus.FAIL, "Exception is : " + ex.getLocalizedMessage());
		}
	}
	
	@Test(priority = 3)
	public void services() {
		try {
			test = reports.startTest(" Verify Services");
			test.log(LogStatus.INFO, "Open Select Plan");
			servicesPage.clickBulkItems(driver);
			test.log(LogStatus.INFO, "Select Yes/No for Large Items");
			servicesPage.clickLargeItems(driver);
			test.log(LogStatus.INFO, "Select Yes/No for Large Items");
			servicesPage.clickWalkUpItems(driver);
			test.log(LogStatus.INFO, "Select Yes/No for Walkup Items");
			servicesPage.clickFragileItems(driver);
			test.log(LogStatus.INFO, "Select Yes/No for Fragile Items");
			servicesPage.clickDisassembleItems(driver);
			test.log(LogStatus.INFO, "Select Yes/No for Disassemble Items");
			servicesPage.clickContinueButton(driver);
			test.log(LogStatus.INFO, "Clicked on Continue Button");
		} catch (Exception ex) {
			test.log(LogStatus.FAIL, "Exception is : " + ex.getLocalizedMessage());
		}
	}
	@Test(priority = 4)
	public void checkOut() {
		try {
			test = reports.startTest(" Verify Check Out");
			test.log(LogStatus.INFO, "Verify Check Out");
//			Assert.assertEquals(getPageTitle(driver), "Booking Inventory | MakeSpace");
			checkOutPage.setFullNameField(driver, "Test QA");
			test.log(LogStatus.INFO, "Entered Full Name");
			checkOutPage.setPhoneNumberField(driver, "6478488709");
			test.log(LogStatus.INFO, "Entered Phone Number");
			checkOutPage.setEmailField(driver, "testemailqa@yopmail.com");
			test.log(LogStatus.INFO, "Entered Email");
			checkOutPage.clickRadioButton(driver);
			test.log(LogStatus.INFO, "Clicked on Radio Button");
			servicesPage.clickContinueButton(driver);
			test.log(LogStatus.INFO, "Clicked on Continue Button");
			checkOutPage.setAddressField(driver, "123 William Street");
			test.log(LogStatus.INFO, "Entered Address");
			checkOutPage.setFloorField(driver, "22");
			test.log(LogStatus.INFO, "Entered Floor");
			checkOutPage.clickConfirmContinueButton(driver);
			test.log(LogStatus.INFO, "Clicked on Confirm and Continue Button");
			checkOutPage.selectDate(driver);
			test.log(LogStatus.INFO, "Selected Date");
			checkOutPage.selectTime(driver);
			test.log(LogStatus.INFO, "Selected Time");
			checkOutPage.clickConfirmContinueButton(driver);
			test.log(LogStatus.INFO, "Clicked on Confirm and Continue Button");
		    checkOutPage.setCardNumberField(driver, "4111111111111111");
			test.log(LogStatus.INFO, "Entered Card Number");
			checkOutPage.setExpDateField(driver, "2/22");
			test.log(LogStatus.INFO, "Entered Exp Date");
			checkOutPage.setCVCField(driver, "222");
			test.log(LogStatus.INFO, "Entered CVC");
			checkOutPage.clickRadioAgreeButton(driver);
			test.log(LogStatus.INFO, "Clicked on Agree Button");
			checkOutPage.clickConfirmAppointmentButton(driver);
			test.log(LogStatus.INFO, "Clicked on Appointent Button");
			Thread.sleep(10000);
			Assert.assertEquals(getPageTitle(driver), "Booking Inventory | MakeSpace");
		} catch (Exception ex) {
			test.log(LogStatus.FAIL, "Exception is : " + ex.getLocalizedMessage());
		}
	}
	@AfterClass
	public void tearDown() {
		endReport();
		tearDown(driver);
	}
}
