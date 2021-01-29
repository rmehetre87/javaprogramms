package Practice;

import java.util.Scanner;

public class ReverseNumber1 {

	//Reverse Number

	/*public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entet Number to reverse: ");

		int num = sc.nextInt();

		int rev = 0;

		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}

		System.out.println("reverse number is : " +rev);

	}*/

	// Reverse String

	public static void main(String[] args) {

		System.out.println("Enter String: ");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String rev = "";

		int length = str.length();

		for(int i = str.length()-1; i>= 0; i-- )
		{
			rev = rev + str.charAt(i);

		}

		System.out.println(rev);
	}



}  

