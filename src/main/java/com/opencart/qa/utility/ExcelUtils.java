package com.opencart.qa.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils 
{
	private Workbook book;
	private static final String FILE_NAME = "";
	private Sheet sheet;
	public Object[][] getData(String sheetName)
	{
		Object [][] data = null;
		try {
			FileInputStream fs = new FileInputStream(FILE_NAME);
			book = WorkbookFactory.create(fs);
			sheet = book.getSheet(sheetName);
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i = 0 ;i<sheet.getLastRowNum();i++)
		{
			for (int j = 0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
		
		
	}
}
