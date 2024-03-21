package exceptionhandling;

public class constructor {

	public constructor() {
		System.out.println("this is default constructor");
	}
	public constructor(String ae) {
		System.out.println(ae);
	}
	public constructor(String ae,String er) {
		System.out.println(ae+er);
	}
	//garbage collector
	public void finalize() {
		System.out.println("carbage collection operation done");
		//int a=10/0;
	}
	
	public static void main(String args[]) {
		constructor con=new constructor("this is parameterised constructor");
		//garbage collector operation done
		con.finalize();
		constructor con1=new constructor("this is parameterised constructor", " with multiple parameter");
		constructor con2=new constructor();
		con2=null;
		constructor con3=new constructor();
		con3=null;
		System.gc();
		
	}
}
