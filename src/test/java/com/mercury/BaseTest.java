package com.mercury;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected static WebDriver driver;

	@BeforeClass
	public static void startup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Before
	public void startUpBeforeTest() throws Exception {
		driver.manage().deleteAllCookies();
		driver.get("http://newtours.demoaut.com/");
	}

	@After
	public void afterTest() throws Exception {
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}
}
