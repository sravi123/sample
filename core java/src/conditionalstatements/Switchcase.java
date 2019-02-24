package conditionalstatements;

public class Switchcase 
{
    public static void main(String[] args)
    {
    	int a=10; int b=20;
    	int c=b-a;
   switch(c)
    	{ 
   case 2:
	   System.out.println("C value is 2");
	break;
   case 4:
	    System.out.println("C value is 4");
	 break;
   case 6:
	   System.out.println("C value is 6");
	 break;
   case 10:
	   System.out.println("C value is 10");
	  break;
	default:
		System.out.println("C value is out of range");
	  break;	
    	}
    }
}
