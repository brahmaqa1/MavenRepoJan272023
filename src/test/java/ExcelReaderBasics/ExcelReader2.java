package ExcelReaderBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader2 {

	// Rows count
	public static int getRowsCnt(String xlFile,String sheet) throws EncryptedDocumentException, IOException
	{
		//  create Workbook ref var
		FileInputStream  fis  =  new FileInputStream(xlFile);
		Workbook  wb =  WorkbookFactory.create(fis);
		Sheet sh=    wb.getSheet(sheet);
		int rowsCnt= sh.getLastRowNum();
		System.out.println("rowsCnt="+rowsCnt);

		return rowsCnt;// rowsCnt=3
	}


	// Rows count
	public static int getColumnssCnt(String xlFile,String sheet) throws EncryptedDocumentException, IOException
	{
		//  create Workbook ref var
		FileInputStream  fis  =  new FileInputStream(xlFile);
		Workbook  wb =  WorkbookFactory.create(fis);
		Sheet sh=    wb.getSheet(sheet);


		//		 Get columns count
		//	sh.getLastCellNum();
		int columnsCnt= sh.getRow(0).getLastCellNum();
		System.out.println("columnsCnt="+columnsCnt);

		return columnsCnt;// rowsCnt=3
	}

	public static String readDataFromExcel(String xlFile,String sheet, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		//  create Workbook ref var
		FileInputStream  fis  =  new FileInputStream(xlFile);
		Workbook  wb =  WorkbookFactory.create(fis);
		Sheet sh=    wb.getSheet(sheet);
		String data =sh.getRow(rowNo).getCell(cellNo).toString();

		return data;
	}

	public static int isSheetExist(String xlFile,String sheet) throws EncryptedDocumentException, IOException
	{
	//  create Workbook ref var
			FileInputStream  fis  =  new FileInputStream(xlFile);
			Workbook  wb =  WorkbookFactory.create(fis);
			int indexno = wb.getSheetIndex(sheet);
			//  return index no of given sheet name 
			// sheet1 index no =0
			// sheet 2 index no = 1
			// if sheet name is not there in excel, it returns -1
			System.out.println("For sheet ="+sheet +  ",indexno="+indexno);
			if(indexno>=0)
			{
				System.out.println("Sheet ="+ sheet + " is exist.");
			}
			else
			{
				System.out.println("Sheet ="+ sheet + " is not exist. Plz check excel file");
			}
			
			return indexno;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//  Apache POI:
		//		
		String xlFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\NovSeleniumBatchWorkSpace\\MyMavenProjectFromCmd\\TestData.xlsx";
		int cnt= getRowsCnt(xlFile,"Sheet1");
		System.out.println("cnt="+cnt);// rowsCnt=3

		cnt= getRowsCnt(xlFile,"CreateUsers");
		System.out.println("cnt="+cnt);// rowsCnt= rowsCnt=8  actual we have 9 rows 




		int colsCnt= getColumnssCnt(xlFile, "Sheet1");
		System.out.println("colsCnt="+colsCnt);// columnsCnt=3

		colsCnt= getColumnssCnt(xlFile, "CreateUsers");
		System.out.println("colsCnt="+colsCnt);// columnsCnt=7  exactly 


		// Read Data 
		String data00 = readDataFromExcel(xlFile, "Sheet1", 0, 0);
		System.out.println("data00="+ data00);// data00=ProductName

		data00 = readDataFromExcel(xlFile, "Sheet1", 0, 1);
		System.out.println("data01="+ data00);// data01=Qty

		data00 = readDataFromExcel(xlFile, "Sheet1", 0, 2);
		System.out.println("data02="+ data00);// data02=Price

		data00 = readDataFromExcel(xlFile, "Sheet1", 1, 0);
		System.out.println("data10="+ data00);


		//		HW  Read all rows and and cells Data  from excel file ?
		//		Note:  use 2 for loops 
		//		0,0   0,1   0,2
		//		1,0   1,1	1,2
		//		2,0	  2,1   2,2

		//HW Devleoep generic method to get Get Column no   based on Column name
		//
		//   getColumnNoBasedOnColumnName("ProductName") ;
		//   //  1
		// getColumnNoBasedOnColumnName("Qty") ; //  2 
		//
		// getColumnNoBasedOnColumnName("Price") ; //  3
		//
		// getColumnNoBasedOnColumnName("QtyInvlaidColumn") ;  //  -1, Display proper msg "Given column name is not found in sheet".
		//		

		isSheetExist(xlFile, "CreateUsers");
		isSheetExist(xlFile, "Sheet1");
		isSheetExist(xlFile, "Sheet2");	
		
		isSheetExist(xlFile, "CreateUsersInvalid");
//		For sheet =CreateUsers,indexno=0
//				For sheet =Sheet1,indexno=1
//				For sheet =Sheet2,indexno=2
//				For sheet =CreateUsersInvalid,indexno=-1
		

	}

}
