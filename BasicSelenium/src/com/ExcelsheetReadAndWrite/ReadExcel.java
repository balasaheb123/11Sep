package com.ExcelsheetReadAndWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws Exception {
		File src = new File("D:\\Zip_Files\\TestData.xlsx");
		FileInputStream fil = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fil);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int recount = sheet1.getLastRowNum();
		System.out.println("Total noumber of rows is" + recount);
		for (int i = 0; i < recount; i++) {
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("data form row" + i + "is" + data0);
		}
		wb.close();
	}
}
