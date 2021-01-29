package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {


		ArrayList al = new ArrayList();
		
		al.add("Rahul");
		al.add("Mad");
		
		System.out.println(al.size());
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
