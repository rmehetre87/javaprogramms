package TryCatchblock;

public class TryCatch1 {

	public static void main(String[] args) {
		TryCatch1 ra = new TryCatch1();
		System.out.println(ra.riskyAction());
	}

	public String riskyAction(){
		
		try{

			int a=100/0;
			}
			catch(ArithmeticException e1 )
			{
			System.out.println(2);

			}
			catch(Exception e)
			{
				System.out.println(1);
			}
			
		return null;
	}
}
