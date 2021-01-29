package TryCatchblock;

public class TryCatch2{

	public static void main(String[] args) {
		System.out.println(riskyAction("hello"));
		System.out.println("-----------");
		System.out.println(riskyAction("howdy"));
	}

	public static String riskyAction(String greeting){
		try{
			if(greeting.equals("hello")){
				System.out.println(greeting + " from try block");
			}else{
				throw new Exception();
			}
			return "returning from try block";
		}catch(Exception e){
			System.out.println(greeting + " from catch block");
			return "returning from catch block";
		}finally{
			return "returning from finally block";
		}
	}
}
