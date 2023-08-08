package casting;
// two type of casting
// 1.primitive casting =>1.implicit casting, 2.explicit casting, 3.boolean casting
// 2.Non-primitive casting

public class primitive_casting {
	
	public static void main(String[] args) {
		
		//implicit casting
		//convrting lower data type info into higher datatype
	
		
		int a=5;  //momory size of int is 4byte
	    System.out.println(a);
	    long b=a;
	    System.out.println(b);
	    System.out.println(b*b);
	    
	    //expicit casting
	    //converting higher data type into lower datatype
	    
	    double c =2.5;
	    System.out.println(c);
	    float d=(float)c;
	    System.out.println(d);
	    
	    //boolean casting
	    //boolean casting is incompatible casting,boolean is a unique data type 
	    //where information allredy predefined inside
	    
	    boolean str=true;
	    
	    
	    
	}
}
