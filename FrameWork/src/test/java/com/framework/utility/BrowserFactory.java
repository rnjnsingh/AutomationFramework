/**
 * 
 */
package com.framework.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ranjan
 * We can keep all the methods here to start different browsers
 */
public class BrowserFactory {
	
	public static WebDriver startBrowser(WebDriver driver, String browserName, String url)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else
		{
			System.out.println("Browser not present");
		}
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
    public static void quitBrowser(WebDriver driver)
    {
    	driver.quit();
    }
}
