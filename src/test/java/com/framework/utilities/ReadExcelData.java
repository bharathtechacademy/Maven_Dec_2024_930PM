package com.framework.utilities;

import java.util.List;
import java.util.Map;

public class ReadExcelData {

	public static void main(String[] args) {
		
		//Read Excel into 2d array
		String [][] data = ExcelUtil.readData("TestData.xlsx", "Sheet1");
		
//		for(String [] dataset : data) {
//			for(String values : dataset) {
//				System.out.println(values);
//			}
//		}
		
		//Read Excel into List
		List<Map<String,String>> excelData = ExcelUtil.readExcelData("TestData.xlsx", "Sheet3");
		excelData.get(2).put("Username", "Sumit");
		
		System.out.println(excelData.get(2).get("Username"));
		

	}

}
