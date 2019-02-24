 package abstract1;
class Parents1
{
public void gold()

{
	System.out.println("Gold");
	
}
public void lands()
{
System.out.println("Lands");	
}
}
class child2 extends Parents1
{
public void shares()
{
System.out.println("Shares");	
}
}


public class Child1 extends Parents1{
	public void house()
	{
		System.out.println("House");
		
	}

	public static void main(String[] args) {
		
     Child a=new Child();
a.shares();
a.gold();
Child1 b=new Child1();
b.house();
b.gold();
	}

}
