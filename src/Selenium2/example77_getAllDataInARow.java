package Selenium2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example77_getAllDataInARow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		   FileInputStream file=new FileInputStream("D:\\Selenium\\katraj.xlsx");
		   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		   
		   //print the data of entire row
		   
		   short lastCellIndex = sh.getRow(0).getLastCellNum();
		   
		   for(int i=0;i<lastCellIndex;i++)
		   {
			  Cell cellInfo = sh.getRow(0).getCell(i);
			  
			  CellType s1 = cellInfo.getCellType();
			  
			  if(s1==CellType.STRING)
			  {
				  String value = cellInfo.getStringCellValue();
				  System.out.print(value+ " ");
			  }
			  
			  else if(s1==CellType.NUMERIC)
			  {
				  double value = cellInfo.getNumericCellValue();
				  System.out.print(value+ " ");
			  }
			  else if(s1==CellType.BOOLEAN)
			  {
				  boolean value = cellInfo.getBooleanCellValue();
				  System.out.print(value+ " ");
			  }
			  
			  
			  
			  
			  
			  
			  
			  
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
}
}