package conditionalstatements;

public class Conditionifelseif {

	public static void main(String[] args) {
		int a=10; int b=20; int c=30;
		if(a>b && a>c)
		{
			System.out.println("A is Greater");
		}
		else if(b>c)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}

	}

}
