package com.Banking.TestCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Banking.utility.Readconfig;


public class BaseClass {


	Readconfig readconfig=new Readconfig();

	public String url=readconfig.geturl();
	public String uname=readconfig.getusername();
	public String Password=readconfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;


	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{


		logger=Logger.getLogger("Banking");
		PropertyConfigurator.configure("log4j.properties");

		if(br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver",readconfig.getchromepath());
			driver=new ChromeDriver();

		} else if(br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("WebDriver.chrome.driver",readconfig.getfirefoxpath());
			driver=new FirefoxDriver();

		}


		driver.navigate().to(url);
		logger.info("Entered url");
		driver.manage().window().maximize();


	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}


	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshot/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}



	public String randomString()
	{
		String randomgenarate=RandomStringUtils.randomAlphabetic(5);
		return randomgenarate;
	}

	public String randomStringnum()
	{
		String randomgenaratenum=RandomStringUtils.randomAlphanumeric(8);
		return randomgenaratenum;
	}

}