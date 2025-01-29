package com.training.java.assignments;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static List<Map<String, String>> readAssignmentData(String filePath, String sheetName) {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheet(sheetName);
			int totalRowsCount = sheet.getPhysicalNumberOfRows();
			int totalColCount = sheet.getRow(0).getPhysicalNumberOfCells();

			for (int rows = 1; rows < totalRowsCount; rows++) {
				Map<String, String> rowData = new HashMap<String, String>();
				for (int col = 0; col < totalColCount; col++) {
					String colName = sheet.getRow(0).getCell(col).getStringCellValue();
					String colVal = sheet.getRow(rows).getCell(col).getStringCellValue();
					System.out.println("Row Number is" + rows+ "and value is"+colName);
					System.out.println("Col Number is" + col+"and value is"+colVal);
					rowData.put(colName, colVal);
				}
				data.add(rowData);
			}
		} catch (Exception e) {
			
		}

		return data;
	}

}
