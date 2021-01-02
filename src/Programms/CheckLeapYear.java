package Programms;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		// Divisible by 4 all century years -- ending with 00
		// centurey  is leap year when its perfectly divisible by 400
		// 1900 is not leap year
		// 2012 is leap year
		
		int year = 1900;
		
		boolean leap = false;
		
		if(year%4 == 0)
		{
			if(year%100 == 0)
			{
				if(year%400 == 0)
				{
					leap = true;
				}else {
					leap = false;
				}
			}else {
				leap = true;
			}
			
		}else {
			leap = false;
		}
		
		if(leap) {
			
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}

	}

}
