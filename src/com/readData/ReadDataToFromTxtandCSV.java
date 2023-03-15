package com.readData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDataToFromTxtandCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Create an Object of Filewriter class
				//File f=new File(System.getProperty("user.dir")+"\\src\\com\\properties\\TestData.txt");
			File f=new File(System.getProperty("user.dir")+"\\src\\com\\properties\\TestData.csv");
			//Create an object of file reader claa	
			FileReader fr=new FileReader(f);
				//Step 2create object of buffered Reader class
				BufferedReader br= new BufferedReader(fr);
				
				
				//Step 3 Read data
				
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				//Step4:-Close
				System.out.println("Read Successfully");
				br.close();
	}

}
