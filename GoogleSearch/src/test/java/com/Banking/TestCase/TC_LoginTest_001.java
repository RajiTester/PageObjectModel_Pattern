package com.Banking.TestCase;




import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking.Pageobject.LoginPage;



public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void LoginTest() throws IOException
	{

		LoginPage lp=new LoginPage(driver);
		lp.username(uname);
		logger.info("Entered Username");

		lp.password(Password);
		logger.info("Entered Password");

		lp.loginbutton();
		logger.info("Clicked login button");

		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager Homepage"))
		{
			Assert.assertTrue(true);
			logger.info("Shown Message is correct");
		}
		else
		{

			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Shown Message is Wrong so failed");
		}


	}

}
