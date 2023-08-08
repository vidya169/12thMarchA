package control_statements;

public class example3_if_else_nested {
	/*
	public static void main(String[] args) {
		int marks=40;
		int marks1=60;
		if(marks>=35){
		
			System.out.println("Congratulation your pass.....!");
			if(marks1>=70) {
				System.out.println("grade= distinction");
			}
			else
			{
				System.out.println("grade= first class");
			}
		}
		else
		{
			System.out.println(" sorry...your fail");
			
		}
		
		
	
	}
	*/
	public static void main(String[] args) {
		int marks=40;
		int marks1=70;
		
		if(marks>=35)
		{
			System.out.println("pass");
			
			if(marks1>=60)
			{
				System.out.println("disincion");
			}
			else
			{
				System.out.println("first class");
			}
		}
		else
		{
			System.out.println("fail");
		}
	}

}
