package Exception_Handling;

public class example4 {

	public static void main(String[] args) {
		
		
		int []ar= new int[4];
		
		try {
			ar[9]=10;
		}
		catch(Exception a)
		{
			System.out.println("generic Exception handle");
		}
		System.out.println( "hi");
		System.out.println("hello");
	}
}
