package com.website.utils;

import java.io.File;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataWriter {
	
	
	public String ExcelPath;
	private XSSFWorkbook wb;
	
	@SuppressWarnings("deprecation")
	public String getData(String SheetName, int RowNum, int ColNum)  throws Exception {
		
		ExcelPath = System.getProperty("user.dir")+"/Data/Credentials.xlsx";
		
		File file = new File(ExcelPath);
		FileInputStream fis = new FileInputStream(file);
		
		
		
		//Workbook workbook = WorkbookFactory.create(fis);
		
		wb = new XSSFWorkbook(fis);
		Cell c = wb.getSheet(SheetName).getRow(RowNum).getCell(ColNum);
		c.setCellType(Cell.CELL_TYPE_STRING);
		String data = c.getStringCellValue();
		data = data.toString();
		return data;
	
	}
	
	

}
