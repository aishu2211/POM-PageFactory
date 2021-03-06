package com.selenium.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.testcases.TestBase;
import com.selenium.util.Constants;


public class TopMenu {
	
	@FindBy(xpath=Constants.dropList)
	WebElement dropList;
	@FindBy(xpath=Constants.accountSetting)
	WebElement accountSettingsLink;
	@FindBy(xpath=Constants.homePage)
	WebElement homePage;


	
	
	WebDriver driver;
	
	public TopMenu(WebDriver dr){
		driver=dr;
	}
	
	public AccountSettings gotoAccountSettings(){
		dropList.click();
		accountSettingsLink.click();
		return PageFactory.initElements(driver, AccountSettings.class);
	}
	
	public void Logout(){
		// logout
		TestBase.isLoggedIn=false;
	}
	
	public LandingPage gotoLandingPage(){
		homePage.click();
		return PageFactory.initElements(driver, LandingPage.class);
 
	}

}
