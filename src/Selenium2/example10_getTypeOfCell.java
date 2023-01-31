package Selenium2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example10_getTypeOfCell
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	   FileInputStream file=new FileInputStream("D:\\Selenium\\katraj.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	  
	  CellType s1 = sh.getRow(0).getCell(0).getCellType(); 
	  
	  System.out.println(s1);
	  
	   
	  System.out.println(sh.getRow(0).getCell(2).getCellType());
	  
	  
	  System.out.println(sh.getRow(2).getCell(1).getCellType());
	   
}
}
