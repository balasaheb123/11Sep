package com.ExcelsheetReadAndWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcealsheetRead {
	public static void main(String[] args) throws Exception {

		File src = new File("D:\\Zip_Files\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// HSSFWorkbook wb=new HSSFWorkbook();\\ if you use xls than this is workbook
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is   " + data);

		int exceldata = (int) sheet1.getRow(0).getCell(1).getNumericCellValue();
		System.out.println("Data from excel is   " + exceldata);
		wb.close();

	}

}
