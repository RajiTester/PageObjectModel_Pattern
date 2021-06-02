package com.Banking.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	WebDriver ldriver;

	public LoginPage (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);

	}

	@FindBy(name="uid")
	@CacheLookup
	WebElement  txtusername;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;

	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement txtlogin;

	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement btnlogout;
	
	
	public void username(String Uname)
	{
		txtusername.sendKeys(Uname);
	}

	public void password(String Password)
	{
		txtpassword.sendKeys(Password);
	}

	public void loginbutton()
	{
		txtlogin.click();
	}
	
	
	
	public void logout()
	{
		btnlogout.click();
	}






















}
