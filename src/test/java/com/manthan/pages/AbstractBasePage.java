package com.manthan.pages;


public class AbstractBasePage{
	
	
	public <T extends AbstractBasePage> void initPageElements(Class<T> pageObjectClass){
	
		//PageFactory.initElements(driverProvider.get(), page);
	}
}
