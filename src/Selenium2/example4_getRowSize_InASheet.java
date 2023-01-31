package Selenium2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4_getRowSize_InASheet 
{
      public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    	  FileInputStream file=new FileInputStream("D:\\Selenium\\katraj.xlsx");
    	  
    	  //row size
//    	 int size = WorkbookFactory.create(file).getSheet("Sheet3").getLastRowNum()+1;
//     	  System.out.println(size);
    	  
//    	  //Col size
//     	   int size1 = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getLastCellNum();
//     	 
//     	  System.out.println(size1);
    	  
    	  //get all data in row
    	  
    	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
    	  
//    	  int LastCellIndex = sh.getRow(0).getLastCellNum();
//    	  
//    	  for(int i=0;i<LastCellIndex;i++)
//    	  {
//    		  String value = sh.getRow(0).getCell(i).getStringCellValue();
//    		  
//    		  System.out.print(value+ " ");
//    	  }
    	  
    	  
    	  int LastRowIndex = sh.getLastRowNum();
    	  
    	  for(int i=0;i<LastRowIndex;i++)
    	  {
    		  String value = sh.getRow(i).getCell(0).getStringCellValue();
    		  System.out.println(value);
    	  }
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
	}
}
