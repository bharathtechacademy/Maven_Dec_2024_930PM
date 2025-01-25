package com.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static String[][] readData(String fileName, String sheetName) {
		String[][] data = null;

		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName); //read the file
			XSSFWorkbook workbook = new XSSFWorkbook(file); //share the file with excel classes
			XSSFSheet sheet = workbook.getSheet(sheetName); //get the sheet to read data
			int totalRows = sheet.getPhysicalNumberOfRows(); //total number of rows having data
			int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();//total number of columns having data in specific row
			data = new String [totalRows-1][totalColumns];
			
			for(int r=1; r<totalRows ; r++) {
				for(int c=0;c<totalColumns; c++) {
					data[r-1][c] = sheet.getRow(r).getCell(c).getStringCellValue();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}
	
	public static List<Map<String,String>> readExcelData (String fileName, String sheetName) {
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName); //read the file
			XSSFWorkbook workbook = new XSSFWorkbook(file); //share the file with excel classes
			XSSFSheet sheet = workbook.getSheet(sheetName); //get the sheet to read data
			int totalRows = sheet.getPhysicalNumberOfRows(); //total number of rows having data
			int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();//total number of columns having data in specific row
			
			for(int r=1;r<totalRows ; r++) {				
				HashMap<String,String> rowData = new HashMap<String,String>(); 				
				for(int c=0; c<totalColumns;c++) {
					String columnName = sheet.getRow(0).getCell(c).getStringCellValue();
					String columnValue = sheet.getRow(r).getCell(c).getStringCellValue();
					rowData.put(columnName, columnValue);
				}
				data.add(rowData);
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return data;		
	}

}
