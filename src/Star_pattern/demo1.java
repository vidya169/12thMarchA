package Star_pattern;

public class demo1 {
	public static void main(String[] args) 
	{
		for(int i=8;i>=1;i--) //rows
		{
			for(int j=1;j<=i;j++) //columns
			{
				System.out.print(" *");
			}
			System.out.println();
		}

		for(int a=1;a<=8;a++) //rows
		{
			for(int b=1;b<=a;b++) //columns
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}


}/*
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
*/