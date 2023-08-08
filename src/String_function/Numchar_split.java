package String_function;

public class Numchar_split {
	
/*		public static void main(String[] args) {
			String a="page2 not found error 404 #";
			
			System.out.println(a.replaceAll("[^0-9]"," "));   //^ Circumflex    ^ accept
			System.out.println(a.replaceAll("[0-9]",""));
			System.out.println(a.replaceAll("[A-Z]",""));
			
			
		}

	}

*/
/*	public static void main(String[] args) {
		String a="vidya9 chavan 234";
		System.out.println(a.replaceAll("[^0-9]"," ")); */
	
	public static void main(String[] args)
	{
		String s1="vidya5 chavan 333 #";
		
		System.out.println(s1.replaceAll("[^0-9]"," "));
		System.out.println((s1.replaceAll("[0-9]","")));
	//	System.out.println(s1.replaceAll("[^A-Z]",""));
		System.out.println(s1.replaceAll("[^a-z]",""));
		System.out.println((s1.replaceAll("[0-9^]","")));
		System.out.println(s1.replaceAll("[a-z]^,[0-9]^",""));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}