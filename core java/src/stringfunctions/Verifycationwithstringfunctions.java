package stringfunctions;

public class Verifycationwithstringfunctions {

	public static void main(String[] args) {
    /*    1.Verify length of a variable should be greater than length of c variable and 
 *            should be less than length of b variable.
 *        2.a variable should not be same as b variable and c variable.
 *        3.c variable should be same as a variable irrespective of the case.
 *        4.a variable should contains "cd" and should not contains "xy".
 *        5.convert b variable into uppercase and verify it should contains "Z" and
 *           should not contains "z"    */	
		
		
		String a="abcdef";
		String b="xyz1234";
		String c="abcxy";
if(a.length()>c.length()  &&  a.length()<b.length())
	{
		System.out.println("PASS");
	}
else
    {
	    System.out.println("FAIL");
    }
if(a.equals(b)==false  &&  a.equals(c)==false)
    {
	System.out.println("PASS");
	}
else
    {
	System.out.println("FAIL");
	}
if(c.equalsIgnoreCase(a)==true)
    {
    	System.out.println("PASS");
    } 
 else    
    {
	 System.out.println("FAIL");
    }
if(a.contains("cd")==true  &&  a.contains("xy")==false)
    {
	System.out.println("PASS");
    }
else
    {
	System.out.println("FAIL");
    }
if(b.toUpperCase().contains("Z")==true  &&  b.toUpperCase().contains("z")==false)
    {
	System.out.println("PASS");
    }
else
    {
	System.out.println("FAIL");
    }
	}

}
