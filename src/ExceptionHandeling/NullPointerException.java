package ExceptionHandeling;

import java.io.FileReader;
import java.io.IOException;

public class NullPointerException {
	
	
	public static void main(String[] args) 
	{
	    try
	    {
	        FileReader file = new FileReader("pom.xml");
	         
	        file = null;
	         
	        file.read();
	    } 
	    catch (IOException e) 
	    {
	        //Alternate logic
	        e.printStackTrace();
	    }
	}
	
	

}
