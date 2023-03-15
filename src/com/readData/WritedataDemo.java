package com.readData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WritedataDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileWriter fw=new FileWriter(System.getProperty("user.dir")+"\\src\\com\\properties\\TestData.properties",true);
		FileOutputStream fw=new FileOutputStream(System.getProperty("user.dir")+"\\src\\com\\properties\\TestData1.properties",true);	
		
		//Step 2:-Create an object File Reader Class
	Properties p= new Properties();
	
	//Use set property method/store to set property
	p.setProperty("url", "rcvacademy.com");	
p.store(fw, "sample comments");
	}

}
