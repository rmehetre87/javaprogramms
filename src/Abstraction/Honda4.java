package Abstraction;

// Example of Abstract class that has an abstract method

abstract class Bike{  
	abstract void run1();
}  

final class Bike1{  
	public void run2() {
		System.out.println("run2 method");
	}
}  

class Honda4 extends Bike{  
	
	void run(){System.out.println("running safely");}  
	
	public static void main(String args[]){  
		Honda4 obj = new Honda4();
		Honda4 obj1 = new Honda4();
		obj.run1();
		obj1.run();
	}

	void run1() {
		System.out.println("running badly");
		
	}  
}  
