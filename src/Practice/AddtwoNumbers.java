package Practice;

public class AddtwoNumbers {

	public static void main(String[] args) {
		
		int num1 = 1234;
		int num2 = 5678;
		
		/*String number = String.valueOf(num1);
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		    System.out.println("digit: " + j);
		}*/
		
			while (num1 > 1) {

			    System.out.println( num1 % 10);

			    num1 = num1 / 10;

			}

		System.out.println(num1);
		
		
		
		}
		  
}
		   
		


