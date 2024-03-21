package exceptionhandling;
//when class declared as Private we can't override it;

public class finalsample {
	private static final String vel ="Hello";
	
	public static final Integer s1(int a) {
		return a;
	}
	
	public static final String s1(String a) {
		return a;
	}
	
	public final static void meth() {
		System.out.println("calling it from inheritance");
	}
	
	public static void main(String args[]) {
		finalsample fs=new finalsample();
		System.out.println(fs.s1(1122));
		System.out.println(fs.s1("hello"));
		meth();
		//vel="erer";
	}	

}
//when class marked as Private we can't override it. 
//extends classname not possible
class B extends finalsample{
	//public static void main(String args[]) {
//		B inh=new B();
//		inh.
//		inh.s1("hello");
	//}	
	
}