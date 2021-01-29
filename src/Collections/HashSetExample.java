package Collections;

import java.util.*;

class HashsetExample{
	
	public static void main(String[] args){

		HashSet<String> al = new HashSet<String>(); // creating hashSet
		
		al.add("Rachit");                 // adding elements
		al.add("Amit");
		al.add("jack");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
