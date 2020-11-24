/**
 * 
 */
package com.framework.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

/**
 * @author Ranjan
 *
 */
public class Helper {

	
public  void captureScreenShot(WebDriver driver) 
{
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination=new File ("./ScreenShots/flip"+ getCurrentDate() +".png");
	
	try {
		FileHandler.copy(source,destination);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}

public static String getCurrentDate()
{
	
	DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			
			Date currentDate = new Date();
			
		return	dateFormat.format(currentDate);
			
}


}
