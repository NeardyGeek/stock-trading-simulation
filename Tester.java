package Plattern;

import java.io.*;
import java.util.*;

public class Tester {

		public static void main(String[] args) {
			
			//Create a bar by passing a string in the form d, o, h, l, c, ac, v
			String l = "2006-01-03,211.471466,218.053055,209.319321,217.832840,217.832840,26216100";
			Bar b = new Bar(l);
			//display it. 
			System.out.println(b.toString());
			b = new Bar("01/03/2006,211.471466,218.053055,209.319321,217.832840,217.832840,26216100");
			//display it. 
			System.out.println(b.toString());
			b = new Bar("2006-01-03,218.053055,209.319321,217.832840,217.832840,26216100");
			//display it. 
			
			b = new Bar("2006:01:03,211.471466,218.053055,209.319321,217.832840,217.832840,26216100");
			//display it. 
			//Using values
			Date d = new Date();
			b = new Bar(d, 211.471466,218.053055,209.319321,217.832840,217.832840,26216100);
			//display it. 
			System.out.println(b.toString());
			
			//how to use files USING SCANNER
			String fileName = "C:\\Users\\predator\\Desktop" + "AAPL" +"_Daily.csv";
			//check if the file exists (use FILE object)
			 File myfile = new File(fileName);
			 if (!myfile.exists()) {
				 System.out.println("file does not exist");
				 System.exit(1);
			 }
			 try {
				 Scanner sc = new Scanner(myfile);
				 String line = sc.nextLine();
				 System.out.println(line);
				 line = sc.nextLine();
				 System.out.println(line);
				//you can do this as long as sc.hasNextLine() is true
				//always close files, buffers and scanners 
				 sc.close();
			 }catch(IOException e){
				 System.out.println(e.toString());
				 System.exit(1);
			 }
			 //YOUCAN USE BufferedReader
			 try{
				 FileReader fr = new FileReader(fileName);
				 BufferedReader br = new BufferedReader(fr);
				 String line = br.readLine();
				 System.out.println(line);
				 //you can use  br.readline() until it returns null
			 }catch(IOException e) {
				 System.out.println(e.toString());
				 System.exit(1);
			 }
			 
	}	
		
}
