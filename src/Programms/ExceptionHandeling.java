package Programms;

public class ExceptionHandeling {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Hello world..args.!!");
			
			int i = 1/0;
			
			System.out.println("completed");
		} catch (Exception e) {
			
			System.out.println(" insied catch block --> "+e.getMessage());
					
		}
		
		finally
		{
			System.out.println("inside catch block");
		}
		
		
	}
	
	

}
