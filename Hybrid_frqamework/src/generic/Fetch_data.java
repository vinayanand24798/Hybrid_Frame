package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data 
{     
	
     public static String get_data(String sh1,int r1,int r2) 
     {
    	 String value=null;
    	 try {
    	  FileInputStream fis = new FileInputStream("./exel/fbdata.xlsx");
    	         Workbook book = WorkbookFactory.create(fis);
    	                  Sheet sh = book.getSheet(sh1);
    	                            Row r = sh.getRow(r1);
    	                            Cell c = r.getCell(r2);
    	                               value = c.toString();
    	   }
    	 catch (Exception e) {
		      System.out.println(e);
		      
		}
    	return value; 
     }

	
}
