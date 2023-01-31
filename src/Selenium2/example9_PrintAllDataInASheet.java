package Selenium2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example9_PrintAllDataInASheet 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	   FileInputStream file=new FileInputStream("D:\\Selenium\\katraj.xlsx");
	   
	   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	   
	   int lastRowIndex = sh.getLastRowNum();
	   
	   for(int i=0;i<lastRowIndex;i++)
	   {
		   short lastCellIndex = sh.getRow(i).getLastCellNum();
		   
		   for(int j=0;j<lastCellIndex;j++)
		   {
			   String value = sh.getRow(i).getCell(j).getStringCellValue();
			   
			   System.out.print(value+ " ");
		   }
		   System.out.println();
	   }
	   
	   
	   
	   
	   
	   
}
}
