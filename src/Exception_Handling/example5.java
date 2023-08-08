package Exception_Handling;

public class example5 {
	public static void main(String[] args) {
		int [] ar=new int[4];
		int a=10;
		int b=0;
		int c;
		
		try {
			ar[5]=6;
		}
		catch(ArrayIndexOutOfBoundsException abc) {
			
			System.out.println("ArrayIndexOutOfBoundsException handle");
		abc.printStackTrace();
	}
  try
  {
	 c=a/b; 
  }
  catch(ArithmeticException xyz)
  {
	 System.out.println("ArithmeticException handle"); 
  }
}
}