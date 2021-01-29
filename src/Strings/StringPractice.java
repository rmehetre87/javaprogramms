package Strings;

public class StringPractice {

	public static void main(String[] args) {

		/*String s1="hello";
		String s2="hello";*/
		
		
			   String s1 = "Sachin";  
			   String s2 = "Sachin";  
			   
			   String s3=new String("Sachin");
			   String s4=new String("Sachin");
			   String s5="Saurav";  
			   
			   if(s1==s2)
			   {
				   System.out.println("Rahul");
			   }
			   
			   /*System.out.println(s1.equals(s2));//true  
			   System.out.println(s1.equals(s3));//true  
			   System.out.println(s1.equals(s4));//false   
			   
*/			   			     
			   System.out.println(s1==s2);//true (because both refer to same instance)  
			   System.out.println(s3==s4);//false(because s3 refers to instance created in nonpool)
			   System.out.println(s1.concat("world"));
			   
			   
			 }  
			  

	}


