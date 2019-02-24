package abstract1;

class A
{
public void a1()
{
System.out.println("This is a1 of A");	
}
}
public class Overrid extends A {
	public void a1()
	{
		System.out.println("This is a1 of Overrid");
		
	}

	public static void main(String[] args) {
		Overrid s=new Overrid();
		s.a1();
	}

}
