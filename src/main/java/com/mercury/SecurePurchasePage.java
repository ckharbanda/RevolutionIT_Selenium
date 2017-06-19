package com.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePurchasePage extends BasePage{

	public SecurePurchasePage(WebDriver driver) {
		super(driver);
	}
	
	public void enterPassengerDetails(){
		enterFirstName();
		enterLastName();
		enterCreditCardNumner();
		checkTheTicketlessTravelBox();
		clickTheSecurePurchaseButton();
	}

	private void clickTheSecurePurchaseButton() {
		driver.findElement(By.name("buyFlights")).click();
	}

	private void checkTheTicketlessTravelBox() {
		boolean isChecked = driver.findElement(By.name("ticketLess")).isSelected();
		if (!isChecked){
			driver.findElement(By.name("ticketLess")).click();
		}
	}

	private void enterCreditCardNumner() {
		driver.findElement(By.name("creditnumber")).sendKeys("4563456345644564");
	}

	private void enterLastName() {
		driver.findElement(By.name("passLast0")).sendKeys("Kharbanda");
	}

	private void enterFirstName() {
		driver.findElement(By.name("passFirst0")).sendKeys("Chirag");
	}
	
	public void verifyIteneraryBookingConfirmation(){
		driver.findElement(By.xpath("//font[contains(.,'itinerary has been booked!')]")).isDisplayed();
	}
	
	
}

