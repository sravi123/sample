package stringfunctions;

public class Verifycationwithstringfunctions2 {

	public static void main(String[] args) {
		/*   1.length of a variable should be greater than length of b and
		              should not be less than length of c.
		     2.concatenate a and b variables and verify length should be less than 
		              c variable or greater than 5.
		     3.a variable should start with "ab" and b variable should not end with "yz".
		     4.c variable should contains space and should not contains 9.
		     5.7th position in c variable should be y or z and k should be available in
		              either 10th or 11th position.
		     6.split c varible into multiple strings and verify length of the array
		              should be 4 or 5.   
		     7.verify first string of the c variable should be same as a variable and
		              should not be same as 3rd string of the c variable.     */

		String a="abcd";
		String b="xyz";
		String c="abcd xyz klmn 1234 4567";
//1
if(a.length()>b.length()==true  &&  a.length()<c.length()==false)
        {
	System.out.println("PASS");
        }
else
        {
	System.out.println("FAIL");
        }
//2
if(a.concat(b).length()<c.length()==true  ||  a.concat(b).length()>5==true)
        {
	System.out.println("PASS");
        }
else
        {
	System.out.println("FAIL");
        }
//3
if(a.startsWith("ab")==true  &&  b.endsWith("yz")==false)
        {
	System.out.println("PASS");
        }
else
        {
	System.out.println("FAIL");
        }
//4
if(c.contains(" ")==true   &&   c.contains("9")==false)
        {
	System.out.println("PASS");
        }
else
        {
	System.out.println("FAIL");
        }

//5
if( (c.charAt(7)=='y')==true || (c.charAt(7)=='z')==true && (c.indexOf("k")==10)==true || (c.indexOf("k")==11)==true)
{
	System.out.println("PASS");
  }
else
   {
	System.out.println("FAIL");
   } 
	//6
String d[]=c.split(" ");
if(((d.length==4) || (d.length==5))==true)
   {
	System.out.println("PASS");
   }
else
   {
	System.out.println("FAIL");
   }
if(((d[0]==a)==true) && ((d[2]==d[0])==false))
   {
	System.out.println("PASS");
   }
else
   {
	System.out.println("FAIL");
   }
	}

}
