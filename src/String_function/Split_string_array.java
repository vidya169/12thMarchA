package String_function;

public class Split_string_array { /*
public static void main(String[] args) {
		String s1="my name is vidya";
		
		String [] ar=s1.split(" ");
		
	 //  System.out.println(ar[1]);
	// System.out.println(ar.length);
	 
	// System.out.println("print all data from array");
	 
	 for(int i=0;i<=ar.length-1;i++)
	 {
		 System.out.println(ar[i]);
	 }
	} */
	public static void main(String [] args) {
		String s1="my name is vidya";
	    String[] s2=s1.split(" ");
	     
	    System.out.println(s2.length);
	    System.out.println(s2[1]);
	    System.out.println("print all data============");
	    for(int i=0;i<=s2.length-1;i++)
	    {
	    	System.out.println(s2[i]);
	    }
		
		
		
		
		
		
	}

}