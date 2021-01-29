package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.xml.transform.Templates;

public class ArrayLista {

	public static void main(String[] args) {


		/*ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		 
		Iterator<Integer> itr = digits.iterator();
		 
		while(itr.hasNext()) 
		{
		    System.out.println(itr.next());
		}*/
		
		// for loop
		ArrayList<Integer> digits1 = new ArrayList<>(Arrays.asList(1,2,3,4));
		ArrayList<Integer> digits2 = new ArrayList<>(Arrays.asList(5,6,7,8));
		
		//System.out.println( "Arralist size: "+digits.size());
		
				
		for(Integer d1 : digits1) 
		{
		    for(Integer d2 : digits2)
		    {
		    	
		    	int temp = digits1.get(1) + digits2.get(1);
		    	
		    }
		    
		}
		
	}
	
	

}
