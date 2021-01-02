package Programms;

public class EmployeeCons {
	
	private int var;
    public EmployeeCons(int num)
    {
           var=num;
    }
    public int getValue()
    {
            return var;
    }
    public static void main(String args[])
    {
    	EmployeeCons myobj = new EmployeeCons(10);
            System.out.println("value of var is: "+myobj.getValue());
    }
	
//	************************ Parameterrized constructor *********************************
		   /*int empId;  
		   String empName;  
			    
		   //parameterized constructor with two parameters
		   EmployeeCons(int id, String name){  
		       this.empId = id;  
		       this.empName = name;  
		   }  
		   void info(){
		        System.out.println("Id: "+empId+" Name: "+empName);
		   }  
			   
		   public static void main(String args[]){  
			   EmployeeCons obj1 = new EmployeeCons(10245,"Chaitanya");  
			   EmployeeCons obj2 = new EmployeeCons(92232,"Negan");  
			obj1.info();  
			obj2.info(); 
			
		   }  */
		}


