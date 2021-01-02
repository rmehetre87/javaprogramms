package Programms;

import java.util.ArrayList;

public class ArrayLIstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(100);
		ar.add("Testing");
		ar.add('t');
		ar.add(100);
		ar.add(100);
		ar.add(true);
		
		System.out.println(ar);
		
		System.out.println(ar.get(2));
		
		//System.out.println(ar.get(-1));
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(700);
		
		System.out.println(ar.size());
		
	}

}
