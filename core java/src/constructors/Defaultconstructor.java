package constructors;

public class Defaultconstructor {
 //creating default constructor
	Defaultconstructor()
	{
		System.out.println("This is a Constructor");
	}
	//creating method
	public void method1()
	{
		System.out.println("This is a method");
	}
	public static void main(String[] args) {
		Defaultconstructor n=new Defaultconstructor();
		n.method1();
	}

}
