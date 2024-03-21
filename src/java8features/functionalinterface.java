package java8features;
//interface which have only one abstract method known as functional interface
//must include @functionalinterface
//
//also known as sam Inteface or single Abstract Method Interface
//it can have any number of non-abstract interface and static method

@FunctionalInterface
interface inter extends defaultinter{
	public void inter();
}

interface defaultinter {
//	public void res();
	default void defaultinter() {
		System.out.println("this is the default method");
	}
	//public void run() ;
		
	
}
public class functionalinterface implements inter {

	@Override
	public void inter() {		
		System.out.println("This is the implementation of interface");
	}
	public static void main(String args[]) {
		functionalinterface f1=new functionalinterface();
		f1.inter();
		f1.defaultinter();
	}
}
