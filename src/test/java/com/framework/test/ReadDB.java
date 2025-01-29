package com.framework.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.framework.utilities.DBUtil;

public class ReadDB {

	public static void main(String[] args) throws SQLException {
		
		String query ="SELECT FILM.TITLE,CATEGORY.NAME AS CATEGORY, LANGUAGE.NAME AS LANGUAGE FROM CATEGORY\r\n"
				+ "JOIN\r\n"
				+ "FILM_CATEGORY\r\n"
				+ "ON CATEGORY.CATEGORY_ID = FILM_CATEGORY.CATEGORY_ID\r\n"
				+ "JOIN\r\n"
				+ "FILM\r\n"
				+ "ON FILM_CATEGORY.FILM_ID = FILM.FILM_ID\r\n"
				+ "JOIN\r\n"
				+ "LANGUAGE\r\n"
				+ "ON FILM.LANGUAGE_ID = LANGUAGE.LANGUAGE_ID\r\n"
				+ "WHERE\r\n"
				+ "LANGUAGE.NAME ='English'\r\n"
				+ "AND\r\n"
				+ "CATEGORY.NAME ='Horror'\r\n"
				+ "ORDER BY FILM.TITLE DESC\r\n"
				+ "LIMIT 10;" ;
		
		List<Map<String,String>> data = DBUtil.readData(query);
		System.out.println(data.get(2).get("title"));

	}

}
