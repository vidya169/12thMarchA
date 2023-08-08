package control_statements;

public class else_if {
public static void main(String[] args) {
		
		
		
		int marks=35;
		if(marks>=70) {
			System.out.println("distinction");
		}
		else if(marks>=60){
			System.out.println("first class");
			
		}
		else if(marks>=50)
		{
			System.out.println("second class");
		}
		else if(marks>=35)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}  
		
	condition(2,2,0);
		
		
		
	} 
	public static void condition(int a, int b, int marks) {
		marks = a*b;
		System.out.println("total marks = "+marks);
		if (marks>=70)
		{
			System.out.println("distinction");
		}
		else if(marks>=60 & marks<=79) {
			System.out.println("first class");
			
		}
		else if(marks>=50 & marks<=69)
		{
			System.out.println("second class");
		}
		else if(marks>=35 & marks<=49)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
	}

}
	
	
		



		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



