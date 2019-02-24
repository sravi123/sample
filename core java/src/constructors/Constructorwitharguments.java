package constructors;

public class Constructorwitharguments {
	//creating variables
	int a; int b;
//creating constructor
	Constructorwitharguments(int m1, int m2)
	{
		a=m1; b=m2;
	}
	//creating methods
	void total()
	{
		System.out.println(a+b);
	}
	void percentage()
	{
		System.out.println((a+b)/2);
	}
	public static void main(String[] args) {
		Constructorwitharguments s1=new Constructorwitharguments(50,60);
		s1.total();
		s1.percentage();
		Constructorwitharguments s2 = new Constructorwitharguments(60,80);
		s2.total();
		s2.percentage();
	}
}
