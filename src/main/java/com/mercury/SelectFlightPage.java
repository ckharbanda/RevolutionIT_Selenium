package com.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlightPage extends BasePage{

	public SelectFlightPage(WebDriver driver) {
		super(driver);
	}
	
	public void verifyDepartIsDisplayed(){
		driver.findElement(By.xpath("//b/font[text()='DEPART']")).isDisplayed();
	}
	
	public SecurePurchasePage clickContinueButton(){
		driver.findElement(By.name("reserveFlights")).click();
		return new SecurePurchasePage(driver);
	}
}

