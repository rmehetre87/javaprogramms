package Inheritance;

public class Main 
{
    public static void main(String[] args) 
    {
        Manager mgr = new Manager();
 
        mgr.setId(1L);
        mgr.setFirstName("Lokesh");
        mgr.setLastName("Gupta");
         
        System.out.println(mgr);
    }
}
