package OOPS;

abstract class abstractive {
	//if class have abstract method class also must have abstract keyword to class
public abstractive() {
	System.out.println("abstraction constructre");
}
//method tagged with abstract keyword and have no body known as abstract method
 abstract int interestrate(int a);
 //it can have anynon abstract methods and can have constructor
 //abstract classes cannot create objects
public static void main() {
	System.out.println("Non abstract method");
}
}
//abstract class must extended by class

public class abstraction extends abstractive{
	static {
		System.out.println("Static block will be executed before main method");
	}
	public static void main(String[] args) {
		System.out.println("main method started to execute");
		abstraction ab=new abstraction();
		System.out.println(ab.interestrate(7));
		abstractive.main();
		abstraction.main();
	}
	
	@Override
	int interestrate(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}
