package methods;

public class Methodoverloading {
	
	public static void openSheet(String sname)
	{
		System.out.println("sheet " + sname +" opened successfully");
	}
    public static void openSheet(int snumber)
    
    {
    	System.out.println("sheet "  +snumber +" opened successfully");
    }
	public static void main(String[] args) {
		openSheet("xyz");
		openSheet(76); 
			}

}
