package com.mercury;

import org.junit.Test;

public class PurchaseFlightTest extends BaseTest{

	@Test
	public void testPurchase() throws Exception {
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.enterLoginDetails();
		
		SelectFlightPage selectFlightPage =  homePage.enterOneWayFlightDetails();
		selectFlightPage.verifyDepartIsDisplayed();
		SecurePurchasePage securePurchasePage=selectFlightPage.clickContinueButton();
		
		securePurchasePage.enterPassengerDetails();
		securePurchasePage.verifyIteneraryBookingConfirmation();	
		}
}
