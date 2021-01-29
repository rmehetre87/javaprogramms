package Practice;

public class StaticNonstaticMethods {
	 
	void NonStaticMethod()
	{
		System.out.println("Non static method");
	}
	
	static void StaticMethod()
	{
		System.out.println("static method");
	}
	
	
	public static void main(String[] args) {
		
		StaticMethod();
		StaticNonstaticMethods object= new StaticNonstaticMethods();
		object.NonStaticMethod();
		StaticMethod(); // Not preferred 
	}
}
