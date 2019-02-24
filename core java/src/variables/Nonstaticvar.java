package variables;

public class Nonstaticvar {
	
public int a=10; public int b=20;
	public static void main(String[] args) {
		
Nonstaticvar n=new Nonstaticvar();
System.out.println(n.a*n.b);
	}

}
