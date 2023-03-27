package ExcelReaderBasics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//  Apache POI:
		
		String xlFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\NovSeleniumBatchWorkSpace\\MyMavenProjectFromCmd\\TestData.xlsx";
		
		
		FileInputStream  fis = new FileInputStream(xlFile);
		Workbook   wb =  WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		// sheet contains rows and cells
		// Rows count 
		int rowscnt= sh.getLastRowNum();	
		System.out.println("rowscnt="+rowscnt);
		// rowscnt=3  But actual 4 rows  - 0,1,2,3 
//		//Exception in thread "main" java.io.IOException: Your InputStream was neither an OLE2 stream, nor an OOXML stream or you haven't provide the poi-ooxml*.jar in the classpath/modulepath - FileMagic: OOXML, having providers: [org.apache.poi.hssf.usermodel.HSSFWorkbookFactory@1efbd816]
//		at org.apache.poi.ss.usermodel.WorkbookFactory.wp(WorkbookFactory.java:300)
//		at org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:199)
//		at org.apache.poi.ss.usermodel.WorkbookFactory.create(WorkbookFactory.java:163)
//		at ExcelReaderBasics.ExcelReader1.main(ExcelReader1.java:20)
//		Solution: addd below dependecy file

//<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
//<dependency>
//    <groupId>org.apache.poi</groupId>
//    <artifactId>poi-ooxml</artifactId>
//    <version>5.0.0</version>
//</dependency>

		// Get columns count
//		sh.getLastCellNum();
		int columnsCnt= sh.getRow(0).getLastCellNum();
		System.out.println("columnsCnt="+columnsCnt);
		// columnsCnt=3  --  displays exact columns count
		
		// Read data from row, cell -  0,0 
		String data00 = sh.getRow(0).getCell(0).toString();
		System.out.println("data00="+data00);
		
		// Read data from row, cell -  0,1 --Qty
		String data01= sh.getRow(0).getCell(1).toString();
		System.out.println("data01="+data01);
		
		// HW Read daat from 0,2 - Price
		
		// Read data from 1,0
		
		String data10= sh.getRow(1).getCell(0).toString();
		System.out.println("data10="+data10); // Lux
		
		// Read data from 1,1
		String data11= sh.getRow(1).getCell(1).toString();
		System.out.println("data11="+data11);

		String data12= sh.getRow(1).getCell(2).toString();
		System.out.println("data12="+data12);
		
		// HW read  all rowsdata - from first column?
		
		//HW  Read all rows  from 2nd columns ?
				
				/// Hw Devleop some generic methods to get rows cnt
				///HW Develop some generic methods to get columns cnt
		
			

	}

}
