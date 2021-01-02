package Collections;

public class StringDemo {

	public static void main(String[] args) {
		
			//creating two string object
				/*String s1 = "abc";
				String s2 = "abc";
				String s3 = "def";
				String s4 = "ABC";*/
				
				/*System.out.println(s1.equals(s2));//true
				System.out.println(s2.equals(s3));//false
				
				System.out.println(s1.equals(s4));//false;
				System.out.println(s1.equalsIgnoreCase(s4));//true
				*/
				
				/*System.out.println(s1.compareTo(s2));//0
				System.out.println(s2.compareTo(s3));//less than 0
				System.out.println(s1.compareToIgnoreCase(s4));//0
				
				System.out.println(s1.compareToIgnoreCase(s4));//0
	*/
				
				
				/*String s = "a/b/c/d";
				String[] a1 = s.split("/");
				System.out.println("split string using only regex:");
				for (String string : a1) {
					System.out.println(string);
				}
				System.out.println("split string using regex with limit:");
				String[] a2 = s.split("/", 2);
				for (String string : a2) {
					System.out.println(string);
					
					String s13 = "Hello World";
					
					System.out.println(s13.contains("W"));//true
					System.out.println(s13.contains("X"));//false
					
					System.out.println(s1.length());//3
					System.out.println(s2.length());//3
					System.out.println(s3.length());//3
*/					
				
				//replace(char oldChar,  char newChar)
				String s = "Hello World";
				s = s.replace('l', 'm');
				System.out.println("After Replacing l with m :");
				System.out.println(s);
				
				//replaceAll(String regex, String replacement)
				String s1 = "Hello journaldev, Hello pankaj";
				s1 = s1.replaceAll("Hello", "Hi");
				System.out.println("After Replacing :");
				System.out.println(s1);
				
				//replaceFirst(String regex, String replacement) 
				String s2 = "Hello guys, Hello world";
				s2 = s2.replaceFirst("Hello", "Hi");
				System.out.println("After Replacing :");
				System.out.println(s2);

			}
					
					
				
}
		
				
				



