package com.crm.qa.utility;



import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import com.crm.qa.base.TestBase;


public class TestUtil extends TestBase{

	public static long Page_Load_TimeOut= 20;
	public static long Implisit_WAIT= 10;
	
	private XSSFWorkbook Workbookname;
	private XSSFSheet sheetname;
	private XSSFCell Cell;


	public void SwithToFrame() {

		driver.switchTo().frame("mainpanel");

	}

	public static void takeScreenshotAtEndOfTest() throws IOException{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "\\screenshots\\" + System.currentTimeMillis() + ".png"  ));

	}

	public Object[][] getDataFromSheet(String name, int rownumber, int cellnum ) {

		String TestSheet_path = "D:\\anshul\\eclipsworkspace\\Automation\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCremTestData.xlsx";
		FileInputStream file =null; 
		

	
				
					try {
						file = new FileInputStream(TestSheet_path);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				       Workbookname = null;
					try {
						Workbookname = new XSSFWorkbook(file);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				         sheetname = Workbookname.getSheet(name);
				         
				   Object[][] data = new Object[sheetname.getLastRowNum()][sheetname.getRow(0).getFirstCellNum()];
				   
				   for (int i=0 ; i< sheetname.getLastRowNum();i++) {
					   for (int k =0; k < sheetname.getRow(0).getLastCellNum(); k++) {
						   data[i][k]=sheetname.getRow(i+1).getCell(k).toString();
					   }
				   }
					   
					   
					 return data; 
				

	}
}