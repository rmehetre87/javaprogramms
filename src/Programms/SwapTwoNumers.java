package Programms;

public class SwapTwoNumers {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		
		/*System.out.println("Before Swaping: ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.println("After Swapping: ");
		
		int temp;
		temp = a;
		a= b;
		b = temp;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);*/
		
		
		// without temp variable
		
		System.out.println("without temp variable");		
		System.out.println("Before Swaping: ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		System.out.println("After Swapping: ");
		
		a= a-b;
		b= a+b;
		a= b-a;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);	
		
		

	}

}
