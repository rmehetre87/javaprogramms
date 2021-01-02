package Programms;

class Test{
int i;
String s;
Test()
{
	System.out.println("no argument constructor");
	
}

Test(int a)
{
	System.out.println("argument constructor= "+a);
	
}

public static void main(String[] args)
{
		
	Test t = new Test();
	Test t1 = new Test(10);

//System.out.println(t.i+"  "+t.s);

}

}