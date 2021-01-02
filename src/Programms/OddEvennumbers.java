package Programms;

import java.util.Scanner;

public class OddEvennumbers {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter Number: ");
		
		int Num = reader.nextInt();
		
		if(Num % 2 == 0)
		{
			System.out.println(Num+" number is even");
		}else
		{
			System.out.println(Num+" number is Odd");
		}
		
		
		
		

	}

}
