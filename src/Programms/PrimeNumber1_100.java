package Programms;

public class PrimeNumber1_100 {

	public static void main(String[] args) {

		//int i = 0;
		int num = 0;
		String Primenumber = "";
		
		for(int i = 1; i<=100; i++)
		{
			
			int counter = 0;
			for(num = i; num>=1; num--)
			{
				if(i%num == 0)
				{
					counter = counter + 1;
				}
			}
			if(counter==2)
			{
				Primenumber  = Primenumber + i + "  ";
			}
		
		
		}
		
		System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(Primenumber);
	}

}
