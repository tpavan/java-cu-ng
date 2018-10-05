package com.manthan.steps;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.manthan.workflow.WorkFlowBase;

public class LoginSteps extends WorkFlowBase {
	
	
	@Test(description="Login into application",alwaysRun=true,enabled=true,expectedExceptions=Exception.class)
	public void loginIntoApp(){
		loginApp.LoginToApp();
		
	}
}
