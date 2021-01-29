package Polymorphism;

class Parent1{  
	
	  void run(){System.out.println("running");
	  
	  }  
	}  
	class child extends Parent{ 
		
	  void run()
	  {
		  System.out.println("running safely with 60km"); 
	  }
	
	  
	  public static void main(String args[]){  
		  child b = new child();//upcasting  
	    b.run();  
	  }  
	 
}