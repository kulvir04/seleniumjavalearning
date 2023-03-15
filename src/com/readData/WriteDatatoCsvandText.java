package com.readData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatatoCsvandText {

	public static void main(String[] args) throws IOException {
		// Create an Object of Filewriter class
		//File f=new File(System.getProperty("user.dir")+"\\src\\com\\properties\\TestData.txt");
	File f=new File(System.getProperty("user.dir")+"\\src\\com\\properties\\TestData.csv");
		FileWriter fw=new FileWriter(f,true);
		//Step 2create object of buffered writer class
		BufferedWriter br= new BufferedWriter(fw);
		
		
		//Step3:-write data
		for(int i=1;i<10;i++) {
		br.write("Nimrat"+" ,");
		}
		//Step4:-Close
		br.close();
	}

}
