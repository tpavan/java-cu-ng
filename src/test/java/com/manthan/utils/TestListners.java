package com.manthan.utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("****Text Execution has started****");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure");	
		String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/target/surefire-reports";
		File file = ((TakesScreenshot) AbstarctBaseUtils.getDriver()).getScreenshotAs(OutputType.FILE);		
		Reporter.log("<a href='"+ file.getAbsolutePath() + "'> <img src='"+ file.getAbsolutePath() + "' height='100' width='100'/> </a>");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");	
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");	
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");	
		
	}

}
