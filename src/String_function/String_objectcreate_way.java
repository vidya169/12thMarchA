package String_function;

public class String_objectcreate_way {
	public static void main(String[] args) {
		
		//object creation of string without using new keyword
		String s1="abc";
		String s2="abc";
		String s3="abc1";
		
		//object creation of string using new keyword
		
		String s4=new String("abc");
		String s5=new String("abc");
		String s6=new String("sbc1");
		
		
		System.out.println(s1==s2);   //true
		System.out.println(s1==s3);   //false
		System.out.println(s1==s4);   //false
        System.out.println(s4==s5);	  //false
        System.out.println(s4==s5);   //false
	}

}
