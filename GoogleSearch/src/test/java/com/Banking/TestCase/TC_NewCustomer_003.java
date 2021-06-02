package com.Banking.TestCase;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking.Pageobject.LoginPage;
import com.Banking.Pageobject.NewCustomer;

public class TC_NewCustomer_003 extends BaseClass
{

	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		lp.username(uname);
		logger.info("Entered is Username");

		lp.password(Password);;
		logger.info("Entered is Password");

		lp.loginbutton();
		logger.info("Clicked login button");

		Thread.sleep(3000);
		
		NewCustomer addcust=new NewCustomer(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details....");
		
		
		addcust.custName("Rajesh Kumar");
		addcust.custgender("male");
		addcust.custDob("10","15","1985");
		Thread.sleep(5000);
		addcust.custaddress("INDIA");
		addcust.custcity("HYD");
		addcust.custstate("AP");
		addcust.custpinno("5000074");
		addcust.custtelephoneno("987890091");
		
		
		
		String email=randomString()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("validation started....");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed....");
			
		}
		else
		{
			logger.info("test case failed....");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
			
	}
	
	
	

}
