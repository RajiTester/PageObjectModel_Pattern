package com.Banking.Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewCustomer {

	WebDriver ldriver;

	public NewCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);

	}



	@FindBy(how= How.XPATH,using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement addlinknewcustomer;

	@FindBy(how= How.NAME,using="name")
	@CacheLookup
	WebElement cusName;

	@FindBy(name="rad1")
	@CacheLookup
	WebElement cusgender;


	@FindBy(id="dob")
	@CacheLookup
	WebElement cusDOB;

	@CacheLookup
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtaddress;

	@CacheLookup
	@FindBy(how = How.NAME, using = "city")
	WebElement txtcity;

	@CacheLookup
	@FindBy(how = How.NAME, using = "state")
	WebElement txtstate;

	@CacheLookup
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtpinno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txttelephoneno;

	@CacheLookup
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtemailid;
	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtpassword;


	@CacheLookup
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;

	public void clickAddNewCustomer() {
		addlinknewcustomer.click();
	}

	public void custName(String cname) {
		cusName.sendKeys(cname);

	}

	public void custgender(String cgender) {
		cusgender.click();
	}



	public void custDob(String MM,String DD, String YYYY) {

		cusDOB.sendKeys(MM);
		cusDOB.sendKeys(DD);
		cusDOB.sendKeys(YYYY);

	}

	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		txtpinno.sendKeys(String.valueOf(cpinno));

	}

	public void custtelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}


}
