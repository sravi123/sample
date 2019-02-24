package loopingstatements;

public class Nestedforloop {

	public static void main(String[] args) {
		int i; int j; int k;
		for(i=1;i<=2;i++)
		{
			for(j=1;j<=2;j++)
			{
				for(k=1;k<=2;k++)
				{
					System.out.println(i+" "+j+" "+k);
				}
			}
		}
	}

}
