import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	
	String s1= scan.next(); //accept string input from user
	System.out.println(s1.length());
	System.out.println("enter num1: ");//accept int input from user
	
	int num1=scan.nextInt();
	System.out.println("enter num 2:");
	int num2=scan.nextInt();
	System.out.println(num1+num2);
	
	}

}
