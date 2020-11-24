package com.framework.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.framework.utility.BrowserFactory;
import com.framework.utility.ConfigDataProvider;
import com.framework.utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ConfigDataProvider configData;
	public ExtentReports report;
	public ExtentTest logger;
	@BeforeSuite
	public void setUpSuite() throws IOException 
	{
		 configData=new ConfigDataProvider();	
		 
		 ExtentHtmlReporter extent=new ExtentHtmlReporter(new File("./Reports/RunReport"+Helper.getCurrentDate() +".html"));
		 report=new ExtentReports();
		 report.attachReporter(extent);
	}
	
	@BeforeClass
	public void setUp()
	{
		driver=	 BrowserFactory.startBrowser(driver,configData.getPropertyvalue("browser"),configData.getPropertyvalue("qaUrl"));
	}
	
	@AfterClass
public void tearDown() throws InterruptedException
{
		//Thread.sleep(50000);
	BrowserFactory.quitBrowser(driver);
}
@AfterMethod
	public void usefulMethods(ITestResult result) 
	{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		Helper obj =new Helper();
		obj.captureScreenShot(driver);
	}
	report.flush();	
	}
}
