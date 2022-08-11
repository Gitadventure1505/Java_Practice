package Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FbDatas {
	 
	 static String id;
	 static String pwd;
	 static Workbook wb;
	 static Sheet sh;
	 static Row r;
	 static Cell c;
	 static String name;
	 
	 static String getUn()
	 {
		 return id;
	 }
	 static String getPwd()
	 {
		 return pwd;
	 }

	static void dummy() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
	
	File f = new File("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	wb = WorkbookFactory.create(fis);
	sh = wb.getSheetAt(0);
	r = sh.getRow(0);
	c = r.getCell(0);
	id = c.getStringCellValue();
	
	
	r = sh.getRow(1);
	c = r.getCell(0);
	pwd = c.getStringCellValue();

	}
	

	

}
