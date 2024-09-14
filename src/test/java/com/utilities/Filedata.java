package com.utilities;

import java.io.FileReader;
import java.util.Properties;

public class Filedata {
	public static Properties pro;

{
	 
try {
	FileReader file = new FileReader(".\\src\\test\\resources\\config.properties");
	pro= new Properties();
	pro.load(file);
	
}
catch(Exception e) {
	System.out.println(e.getMessage());
	
}

}
public String s=pro.getProperty("execution");

public String geturl() {
	String ur=pro.getProperty("URL");
	return ur;
}

public String getvalue() {
	String va=pro.getProperty("value");
	return va;
}




}
