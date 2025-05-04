package com.medimention.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Join Us']")
	@CacheLookup
	WebElement register;
	
	@FindBy(xpath="//a[@class='navbar-brand']/small")
	@CacheLookup
	WebElement mediHead;
	
	public void registerbtn()
	{
		register.click();
	}
	
	public void MediHeading()
	{
		mediHead.click();
	}
}
