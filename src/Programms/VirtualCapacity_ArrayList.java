package Programms;

import java.util.ArrayList;

public class VirtualCapacity_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> ar = new ArrayList<Object>(20);
		
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(100);
		System.out.println(ar.size());
		

	}

}
