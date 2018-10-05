package com.manthan.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(com.manthan.utils.TestListners.class)
public class AbstarctBaseUtils {
	
	private static WebDriver driver = null;
	
	@BeforeSuite
	public void initTestEnvironment(){
		
		switch (System.getProperty("env")) {
		case "stage":
			//driver = new FirefoxDriver();
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();			
			break;
			
		case "demo":
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();	
			break;
		default:
			
			break;
		}
	}
	
	
	@BeforeSuite(enabled=false)	
	public void loggerConfiguration(){
		System.out.println("loggerConfiguration");
	}
	
	@AfterSuite(alwaysRun=true,enabled=false)
	public void initTestClosure(){
		System.out.println("initTestClosure");
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}