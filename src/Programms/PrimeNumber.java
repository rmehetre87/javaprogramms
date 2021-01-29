package Programms;

public class PrimeNumber {

	  public static void main(String[] args) {

		int num = 13, i=2;
		boolean flag = false;
		
		while(i<=num/2)
		{
			if(num%i == 2)
			{
				flag = true;           // login for no prime
				break;
			}
			
			++i;
		}
		if(!flag)
			System.out.println(num+ " is prime number");
		else
			System.out.println(num+ " is not a prime number");
				  
	  }
	}
