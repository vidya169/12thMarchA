package Exception_Handling;

public class example1 {
	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		int c=0;
		
		
		try {
			c=a/b;
		}
		catch(ArithmeticException e)  
		{
			System.out.println("arithmetic exception handled");
			c=a/1;   //alternate solution but its not madnetory
		}
		System.out.println(c);
		System.out.println("gm");
	}

}
