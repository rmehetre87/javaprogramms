package Practice;

/*public class wordCount {
	
	public static void main(String[] args) {
	
        int count = 0; 
        
        String str ="India Is My Country";
    
          char ch[]= new char[str.length()]; 
          
          for(int i = 0; i < str.length(); i++)  
          {  
              ch[i] = str.charAt(i);  
              
              if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                  
            	  count++;  
          }
          
          System.out.println(" Wordcount in String = " +count); 
           
      }

}  
*/


public class wordCount{

public static int wordCount(String input)

{ 
	if (input == null || input.isEmpty()) 

	{ return 0;	} 

	String[] words = input.split("\\s+"); 

	return words.length; 

}


public static void main(String[] args) {
	
String str = "My name is Rahul";	

	System.out.println(wordCount(str));	
	
}
}

