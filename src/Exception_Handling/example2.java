package Exception_Handling;

public class example2 {
public static void main(String[] args) {
	int [] ar=new int[4];
	
	try
	{
		ar[2]=10;
		
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException handle");
	}
	System.out.println("hi");
	System.out.println("hello");
}
}
