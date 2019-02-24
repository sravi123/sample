package stringfunctions;

public class Split {

	public static void main(String[] args) {
     String a="SRA VAN THI . CHITU MALLA";
     String[] b=a.split(" ");
     int i;
     for(i=0;i<b.length;i++)
     {
    	 System.out.println(b[i]);
     }
   //printing design
     for(i=1;i<=3;i++) 
     {
     System.out.println("*********");
     }
   //print strings which are having length value 3
     for(i=0;i<b.length;i++)
     {
    	 if(b[i].length()==3)
    	 {
    		 System.out.println(b[i]);
    	 }
     }
	}

}
