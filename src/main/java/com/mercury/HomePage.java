package com.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public String getTitle(){
		return driver.findElement(By.xpath("//head/title")).getText();
	}
	
	public SelectFlightPage enterOneWayFlightDetails(){
		selectOneWayTrip();
		selectDepartingFromCity("Sydney");
		selectArrivingCity("London");
		selectFirstClassServiceClass();
		clickContinue();
		return new SelectFlightPage(driver);
	}

	private void selectArrivingCity(String arrivingCity) {
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText(arrivingCity);
	}

	private void clickContinue() {
		driver.findElement(By.name("findFlights")).click();
	}

	private void selectFirstClassServiceClass() {
		driver.findElement(By.name("servClass")).click();
	}

	private void selectDepartingFromCity(String departingcity) {
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText(departingcity);	
	}

	private void selectOneWayTrip() {
		driver.findElement(By.name("tripType")).click();
	}
	
}

