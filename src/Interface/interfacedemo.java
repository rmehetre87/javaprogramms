package Interface;

interface printable
{  
	void print();
	void print1();
}

interface printable1
{  
	void print2();
	void print3();
}  

class interfacedemo implements printable, printable1
	{
	
		public void print()
		{
			System.out.println("Hello");
		} 
		public void print1()
		{
			System.out.println("Hello1");
		}
		
		public void print2() {
			System.out.println("Hello2");
			
		}
		
		public void print3() {
			System.out.println("Hello3");
			
		}

	public static void main(String args[]){  
		interfacedemo obj = new interfacedemo();  
		obj.print1();
		obj.print2();
		obj.print3();
		obj.print();
	}
	

	
	 
}  
