package Polymorphism;

// Method Overloading

public class Add{

	public int Add(int a , int b){
		return (a + b); }

	public double Add(int a , int b , double c)
	{
		return (a + b + c); 
	}

	public static void main(String args[]){
		
		Add ob = new Add();
		System.out.println(ob.Add(10 , 2));
		System.out.println(ob.Add(10, 2 , 3.5));
	}
}

