package com.medimention.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//button[@data-id='UserRole']")
	@CacheLookup
	WebElement dropdwn;
	
	@FindBy(xpath="//span[text()='Blood Bank']")
	@CacheLookup
	WebElement BB;
	
	@FindBy(xpath="//input[@id='DetailName']")
	@CacheLookup
	WebElement BussName;
	
	@FindBy(xpath="//input[@id='UserUsername']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//input[@id='UserEmail']")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath="//input[@id='UserPassword']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//input[@id='UserPassword1']")
	@CacheLookup
	WebElement confpass;
	
	@FindBy(xpath="//input[@name='terms']")
	@CacheLookup
	WebElement terms;
	
	@FindBy(xpath="//span[text()='Register']")
	@CacheLookup
	WebElement regbtn;
	
	public void selectGroup()
	{
		dropdwn.click();
	}
	
	public void BloodBank()
	{
		BB.click();
	}
	
	public void BName(String name)
	{
		BussName.sendKeys(name);
	}
	
	public void setUser(String user)
	{
		username.sendKeys(user);
	}
	
	public void setEmail(String userEmail)
	{
		email.sendKeys(userEmail);
	}
	
	public void setPass(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void setConfPass(String confpassword)
	{
		confpass.sendKeys(confpassword);
	}

	public void setTerms()
	{
		terms.click();
	}
	
	public void regButton()
	{
		regbtn.click();
	}
}
