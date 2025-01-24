package com.framework.utilities;

import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) {
		Properties prop = PropUtil.readData("prod", "Config.properties");
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));

	}

}
