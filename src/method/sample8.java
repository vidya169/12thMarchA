package method;

public class sample8 {
	public static void main(String[] args) {
		sample9.addition(3, 3, 5);
		sample9.division(2, 2);
		System.out.println("---------------------------------------------------------------------");
		sample9.studinfo("vidya", "computer", 101, 90.23f, 'A');
		System.out.println("-------------------------non-static with parameter--------------------------------");
		sample9 v1 =new sample9();
		v1.multiplication(4, 3, 6);
		
	}

}
