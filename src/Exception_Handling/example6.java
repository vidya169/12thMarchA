package Exception_Handling;

public class example6 {
	public static void main(String[] args) {
		int [] arr=new int[3];
		
		try {
			
			try
			{
				
			arr [4]=10;	
			}
			catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Arithmetic Exception handle");
			}
			
			arr[5]=20;
			
	}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("Arithmetic Exception handle");
		}
		System.out.println("hii");
		System.out.println("hello");  

}
}
