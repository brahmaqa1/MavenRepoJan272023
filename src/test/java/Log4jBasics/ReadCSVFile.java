package Log4jBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {

	public static void main(String[] args) throws IOException {
		// Read notepad
//		FileReader
//		BufferedReader
		String csvFile= ".\\src\\test\\java\\Log4jBasics\\MyCSvFile.csv";
		File f =  new File(csvFile);
		FileReader  fr =  new FileReader(f);		
		BufferedReader br = new BufferedReader(fr);
		
//		String line1= br.readLine();
//		String line2= br.readLine();
		
//		System.out.println("line1="+line1);
//		System.out.println("line2="+line2);
		String x= "";
		while( (x=br.readLine()) !=null)
		{
//			System.out.println("lines ="+ br.readLine());
			System.out.println("lines ="+ x);
		 String sarr [] = 	 x.split(","); 
		 // ename, eno, Location
		 
		 System.out.println("array ="+sarr[0]);
		 System.out.println("array ="+sarr[1]);
		 System.out.println("array ="+sarr[2]);
		 
			
		}
		
		

	}

}
