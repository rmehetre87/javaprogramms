package Constructors;

public class Hello {
	
	String Name;
	
	//only public, protected & private are permitted
	
	public Hello(int a){
		
		System.out.println("a: "+a);
		
		this.Name = "Constructor Demo";
		
	}
	
	public static void main(String[] args) {
		
		//new Hello(15);

		Hello obj = new Hello(15);
		
		System.out.println(obj.Name);
		

	}

}
