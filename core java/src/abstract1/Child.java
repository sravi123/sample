package abstract1;
class GrandParents
{
public void gold()
{
	System.out.println("Gold");
	}
}
class Parent extends GrandParents
{
public void lands()
{
	System.out.println("Lands");
	}
}

public class Child extends Parent{
	
	public void shares()
	{
		System.out.println("Shares");
		}

	public static void main(String[] args) {
		Child s=new Child();
		s.shares();
		s.lands();
		s.gold();
		
	}

}
