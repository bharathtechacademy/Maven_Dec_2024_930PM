package com.framework.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DBUtil {
	
	
	
	public static ResultSet readDB(String query) throws SQLException {
		Properties prop = PropUtil.readData("prod", "Config.properties");
		ResultSet dataSet = null;
		String url = prop.getProperty("db_url");
		String username = prop.getProperty("db_username");
		String password = prop.getProperty("db_password");		
		Connection connection = DriverManager.getConnection(url, username, password); //connect with database
		dataSet = connection.createStatement().executeQuery(query);	//run the query and get the data
		return dataSet;
	}
	
	public static List<Map<String,String>> readData(String query) throws SQLException{
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		ResultSet dataSet = readDB(query);
		while(dataSet.next()) {
			Map<String,String> rowData = new HashMap<String,String>();
			for(int col =1; col <=dataSet.getMetaData().getColumnCount() ; col++) {
				String columnName= dataSet.getMetaData().getColumnName(col);
				String columnValue = dataSet.getString(col);
				rowData.put(columnName, columnValue);
			}
			data.add(rowData);
		}
		
		return data;		
	}

}
