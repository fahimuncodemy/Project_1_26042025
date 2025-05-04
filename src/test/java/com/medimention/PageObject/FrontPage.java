package com.medimention.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontPage extends BasePage{

	WebDriver driver;
	
	public FrontPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[text()='Home']")
	@CacheLookup
	WebElement home;
	
	public void homebtn()
	{
		home.click();
	}
}
