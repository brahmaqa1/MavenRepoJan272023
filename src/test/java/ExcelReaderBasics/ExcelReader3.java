package ExcelReaderBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//  Apache POI:
		// We have some predefined classses and interfaces  abd predefined methdos which can be used to read excel file
//		2 classes 	
		
//		HSSFWorkbook  - Predefined class -  to read  from .xls format 
//		XSSFWorkbook  -Predefined class  --to read from .xlsx format
		
		String xlFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\NovSeleniumBatchWorkSpace\\MyMavenProjectFromCmd\\TestDataOld.xls";
		
		FileInputStream fis=  new FileInputStream(xlFile);
		HSSFWorkbook  hssfwb = new HSSFWorkbook(fis);
		HSSFSheet  hsssfsh = hssfwb.getSheet("Sheet1");
		
		String data00 = hsssfsh.getRow(0).getCell(0).toString();
		System.out.println("data00="+data00);
		
		// HW read data from .xlsx format file 
			

	}

}
