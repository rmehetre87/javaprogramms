package Polymorphism;

// Mehtod Overriding

/*class Parent{
	
	void view(){
		System.out.println("this is a parent class method");
	}
}
class Child extends Parent{
	void view(){
		System.out.println("this is a child class method");
	}
	
public static void main(String args[]){
	
	Parent ob = new Parent();
	ob.view();
	
	Child ob1 = new Child();
	ob1.view();
}

}*/


// super method overriding
class Parent {
	void show(){
		System.out.println("parent class method");
	}
}
	class Splendor extends Parent {
		void show(){
			super.show();
			System.out.println("child class method");
		}
		public static void main(String args[]){
			Parent ob = new Splendor();
			ob.show();
		}
	}