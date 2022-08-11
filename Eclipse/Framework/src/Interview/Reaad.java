package Interview;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Reaad {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fin = new FileInputStream("");
		Workbook wb = WorkbookFactory.create(fin)	;
		Sheet sh = wb.getSheetAt(0);
		for (int i = 0; i < sh; i++) 
		{
		  for (int j = 0; j < args.length; j++) 
		  {
			  
				
				Row r = sh.getRow(i);
				
				Cell c = r.getCell(j);
				System.out.println();
		}	
		}
		
	}

}
