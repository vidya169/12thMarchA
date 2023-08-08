package Exception_Handling;

public class example3 {
	public static void main(String[] args) {
		int [] ar=new int[4];
		
		try
		{
			ar[7]=10;
			
		}
		catch(ArithmeticException a)
		{
			System.out.println("arithmatical exception handle");
			a.printStackTrace();
			
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handle");
		}
		
		System.out.println("hi");
		System.out.println("hello");
		
	}

}
