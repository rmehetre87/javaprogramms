package ExceptionHandeling;

import java.io.FileReader;

public class FileNotFoundException {
	
	public static void main(String[] args) throws java.io.FileNotFoundException 
	{
	    FileReader file = new FileReader("somefile.txt");
	}
	
	
}
