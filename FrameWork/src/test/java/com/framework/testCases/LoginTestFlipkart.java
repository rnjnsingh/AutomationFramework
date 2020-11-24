package com.framework.testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.framework.pages.BaseClass;
import com.framework.pages.LoginToFlipkartPage;

public class LoginTestFlipkart extends BaseClass {
	
	@Test
public void loginMethod()
{

	/*ExcelDataProvider excel =new ExcelDataProvider();
String userName= excel.getStringData("Login",0,0);
	

	String pass= excel.getStringData("Login",0,1);
		
*/
		logger=report.createTest("Login to flipkart");
		LoginToFlipkartPage LoginToFlipkartPage = PageFactory.initElements(driver,LoginToFlipkartPage.class);
		logger.info("Starting application");
		LoginToFlipkartPage.loginToFlipkart("userName1","pass2");
		logger.pass("Test pass");
		
		
}
}
