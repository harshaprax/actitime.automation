package acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Name : Excel Helper Class
 * Developed By : Shobha
 * Approved By : Shantosh
 * Last Modified Date : 7/27/2022
 * Description : Used to fetch the data from excel sheet
 */


public class ExcelLib {

XSSFWorkbook wb;
	
	// this constructor is used to load the excel file
	public ExcelLib(String excelPath) {		
		try
		{
			File file = new File(excelPath);
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		}
		catch(Exception e)
		{
			System.out.println("unable to load the excel file please check.."+e.getMessage());
		}
	}
	
	// this method is used to return the active number of rows
	public int getRowCount(int sheetnum)
	{
		return wb.getSheetAt(sheetnum).getLastRowNum()+1;
	}
	
	public int getRowCount(String sheetname)
	{
		return wb.getSheet(sheetname).getLastRowNum()+1;
	}
	
	// this method is used to get the cell data by using sheet index
	public String getCellData(int sheetnum, int row, int col)
	{
		return wb.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
	}
	
	// this method is used to get the data from sheet by using sheet name
	public String getCellData(String sheetname, int row, int col)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(col).toString();
	}
	
	
}
