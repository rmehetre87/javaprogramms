package Programms;

public class AlphabetCheck {

	public static void main(String[] args) {

		char c = 't';
		
		if((c >= 'a' && c<= 'z') || (c >= 'A' && c<= 'Z'))
		
		{
			System.out.println(c+ " is alphabet");
		}else {
			System.out.println(c+ " is not alphabet");
		}
		
		
	}
}
