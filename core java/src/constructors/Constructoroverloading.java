package constructors;

public class Constructoroverloading {
//creating variables
	int a; int b; int c;
	//creating constructor
	Constructoroverloading(int m1,int m2)
	{
		a=m1;b=m2;
	}
	Constructoroverloading(int m1,int m2,int m3)
	{
		a=m1; b=m2; c=m3;
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
	void total1()
	{
		System.out.println(a+b+c);
	}
	void percentage1()
	{
		System.out.println((a+b+c)/3);
	}
	public static void main(String[] args) {
		Constructoroverloading s1=new Constructoroverloading(50,60);
				s1.total();s1.percentage();           
		Constructoroverloading s2=new Constructoroverloading(40,50,80);
          s2.total1(); s2.percentage1();
	}

}
