package methods;

public class Methodwithoutarguments {
	//creating static method
	public static void a1()
	{
		int a=10; int b=5;
		System.out.println(a*b);
	}
    //creating non static method
	public void b1()
	{
		int a=40; int b=20;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		//calling static method
		a1();
		//creating object
		Methodwithoutarguments n=new Methodwithoutarguments();
		n.b1();
	}

}
