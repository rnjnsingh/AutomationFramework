package com.framework.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	public XSSFSheet obj;
	public ExcelDataProvider()
	{
		try {
		XSSFWorkbook excel=new XSSFWorkbook("C:\\Users\\Ash\\git\\AutomationFramework\\FrameWork\\Testdata\\TestData2.xlsx");
	obj=excel.getSheet("Login");
			
			 
		} catch (Exception e) {
			System.out.println("file not found"+e.getMessage());
		}
	}
	
	public String getStringData(int row, int col)
	{
		return obj.getRow(row).getCell(col).getStringCellValue();
	}

	/*public String getStringData(int row, int col  )
	{
		return obj.getRow(row).getCell(col).getStringCellValue();
	}
	*/
}
