package com.mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage enterLoginDetails(){
		enterUsername();
		enterPassword();
		clickLoginButton();
		return new HomePage(driver);
	}
	
	private void enterUsername(){
		driver.findElement(By.name("userName")).sendKeys("mercury");
	}
	
	private void enterPassword(){
		driver.findElement(By.name("password")).sendKeys("mercury");
	}
	
	private void clickLoginButton(){
		driver.findElement(By.name("login")).click();
	}

}

