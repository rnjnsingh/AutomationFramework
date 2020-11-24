package com.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginToFlipkartPage {
	
	
	
	
	
	
@FindBy(how=How.XPATH,using="//input[@class='_2IX_2- VJZDxU']")
WebElement userName;

@FindBy(how=How.XPATH,using="//input[@class='_2IX_2- _3mctLh VJZDxU']")
WebElement password;

@FindBy(how=How.XPATH,using="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
WebElement submitButton;



	public void loginToFlipkart(String uid, String pass)
	{
		userName.sendKeys(uid);
		password.sendKeys(pass);
		submitButton.click();
	}

}
