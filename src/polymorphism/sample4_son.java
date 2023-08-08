package polymorphism;

public class sample4_son extends sample3_poly_method_overriding_father  {
  public void car()
  {
	  System.out.println("Car: Audi Q8");
  }
  public void money()
  {
	  System.out.println("Money: 20L");
  }
  public void Home()
  {
	  System.out.println("Home: 3BHK");
  }
  public void gold()
  {
	  System.out.println("gold: 2kg");
  }
  
  
  public static void main(String[] args) {
	  sample4_son s1=new sample4_son();
	  s1.car();
	  s1.money();
	  s1.Home();
	  s1.gold();
	  s1.Estate();
	  
	  
	  
}
  
	

}
