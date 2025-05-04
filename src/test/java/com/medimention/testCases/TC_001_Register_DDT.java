package com.medimention.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.medimention.PageObject.AccountPage;
import com.medimention.PageObject.FrontPage;
import com.medimention.PageObject.HomePage;
import com.medimention.PageObject.RegisterPage;
import com.medimention.utilities.DataProviders;

public class TC_001_Register_DDT extends BaseClass{

	@Test(dataProvider="RegData", dataProviderClass= DataProviders.class, groups="DataDriven")
	public void account_Register(String B_Name, String U_name, String U_email, String Pass, String C_pass)
	{
		FrontPage fp= new FrontPage(driver);
		HomePage hp= new HomePage(driver);
		RegisterPage rp=new RegisterPage(driver);
		AccountPage ap= new AccountPage(driver);
//		Faker fake= new Faker();
		
//		String password= fake.internet().password();
//		String busiName= fake.name().name();
//		String UserName= fake.name().firstName();
//		String UserEmail= fake.internet().emailAddress();
		try {
		fp.homebtn();
		hp.registerbtn();
		rp.selectGroup();
		rp.BloodBank();
		rp.BName(B_Name);
		rp.setUser(U_name);
		rp.setEmail(U_email);
		rp.setPass(Pass);
		rp.setConfPass(C_pass);
		rp.setTerms();
		rp.regButton();
		
		System.out.println(B_Name+"\t"+U_name+"\t"+U_email+"\t"+Pass);
		System.out.println(ap.AccHeading());
		System.out.println(ap.NameText());
		Assert.assertTrue(ap.AccHeading().contains(B_Name));
		Assert.assertEquals(ap.NameText(), B_Name);		
		
		ap.logoutDrp();
		ap.logout();
		hp.MediHeading();
		}catch(Exception e)
		{
			driver.navigate().refresh();
		}
	}
}
