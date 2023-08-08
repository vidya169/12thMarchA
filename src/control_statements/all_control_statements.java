package control_statements;

public class all_control_statements {
	public static void main(String[] args) {
	all_control_statements s1=new all_control_statements();
	s1.v1(20,1,0);
	s1.v1(20, 2, 0);
	
	
		
		
	}
	public  void v1(int a, int b, int marks) {
		marks= a*b;
		
		System.out.println("total marks = "+ marks);
		if(marks>=35)
		
		{
			int marks1=a*b;
			System.out.println("pass");
			if(marks>=70)
			{
				System.out.println("distinction");
			}
			else
			{
				System.out.println("first class");
			}
		
		}
		
		else if(marks>=36 & marks<=50)
		{
			System.out.println(" second class");
		}
		else if(marks>=51 & marks<=50)
		{
			System.out.println("second higher class");
		}
		else
			
		{
			System.out.println("fail");
		}
		
		
	}

}
