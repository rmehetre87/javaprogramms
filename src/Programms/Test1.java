package Programms;

class Test1 { 

    static int noOfObjects = 0; 
  
    { 
        noOfObjects += 1; 
    } 
  
    // various types of constructors 
    // that can create objects 
    public Test1() 
    { 
    } 
    public Test1(int n) 
    { 
    } 
    public Test1(String s) 
    { 
    } 
  
    public static void main(String args[]) 
    { 
    	Test1 t1 = new Test1(); 
    	Test1 t2 = new Test1(5); 
    	Test1 t3 = new Test1("GFG");
  
        // We can also write t1.noOfObjects or 
        // t2.noOfObjects or t3.noOfObjects 
        System.out.println(Test1.noOfObjects); 
    } 
} 
