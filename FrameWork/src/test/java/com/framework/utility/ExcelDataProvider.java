package com.framework.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*public class ExcelDataProvider {
	public XSSFWorkbook obj;
	public ExcelDataProvider()
	{
		try {
		File src =new File("./Testdata/TestData2.xlsx");
	
			FileInputStream Raw =new FileInputStream(src);
			 obj=new XSSFWorkbook(Raw);
		} catch (Exception e) {
			System.out.println("file not found"+e.getMessage());
		}
	}
	
	public String getStringData(String sheetName, int row, int col)
	{
		return obj.getSheet(sheetName).getRow(row).getCell(col).getStringCellValue();
	}

	public String getStringData(int index,int row, int col  )
	{
		return obj.getSheetAt(index).getRow(row).getCell(col).getStringCellValue();
	}
}
*/