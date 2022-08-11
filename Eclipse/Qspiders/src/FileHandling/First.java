package FileHandling;

import java.io.File;
import java.io.IOException;

public class First {

	public static void main(String[] args) throws Exception
	
	{
	  File f1 = new File("E:\\java.txt");
	  boolean b = f1.createNewFile();
	  System.out.println(b);

	  
	  Thread.sleep(3000);
	  
	  boolean c = f1.exists();
	  
	  System.out.println(c);
	   
	  
	
	  
	

	}

}
