package String_function;

public class String_reverse_order {

	/*public static void main(String[] args) {
String s1="my name is vidya";
		
		String [] ar=s1.split(" ");
		
	   System.out.println(s1);
	 System.out.println(ar.length);
	 
	 System.out.println("print all data from array");
	 
	 for(int i=ar.length-1;i>=0;i--)
	 {
		 System.out.println(ar[i]+"");
	 }
	}
}*/
/*	
	public static void main(String[] args)
	{
		String s1="vidya@chavan";
		
		String [] str=s1.split("&");
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.println(str[i]);
		}
		
	} */
	
	public static void main(String[] args)

	{
		String s1="shree swami samarth";
		String[] s2=s1.split(" ");
		
		System.out.println(s2.length);
		System.out.println("===print all data===");
		for(int i=0;i<=s2.length-1;i++)
		{
			System.out.println(s2[i]);
		}
		System.out.println("===print reverse string====");
		for(int j=s2.length-1;j>=0;j--)
		{
			System.out.println(s2[j]);
		}
	}
}

