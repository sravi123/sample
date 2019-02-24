package abstract1;

class Parents
{
	
	public void lands()
	{
		System.out.println("Lands");
	}
	}

public class X extends Parents{
	public void Gold()
	{
		System.out.println("Gold");
	}

	public static void main(String[] args) {
		
X s=new X();
s.Gold();
s.lands();
}
}