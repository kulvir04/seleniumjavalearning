package com.readData;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step 1:-Create an object File Reader Class
//FileReader fr=new FileReader("C:\\Kulvir Eclipse\\LearningJava\\src\\com\\properties\\TestData.properties");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\properties\\TestData.properties");
	//Step 2:-Create an object File Reader Class
Properties p= new Properties();
//Step3:- Load   the property class
p.load(fis);
//step4 :- Use get property method to get property
System.out.println(p.getProperty("url"));
System.out.println(System.getProperty("user.dir"));
	}

}
