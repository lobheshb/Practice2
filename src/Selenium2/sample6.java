package Selenium2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample6 
{
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    	FileInputStream file=new FileInputStream("D:\\Selenium\\katraj.xlsx");
    	
    	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
    	
    	String value = sh.getRow(0).getCell(0).getStringCellValue();
    	System.out.println(value);
    	
    	double value1 = sh.getRow(2).getCell(0).getNumericCellValue();
    	System.out.println(value1);
    	
    	boolean value2 = sh.getRow(3).getCell(0).getBooleanCellValue();
    	System.out.println(value2);
    	
	}
}
