package OOPS;


public class overriding {
	//can't override static method
	//method name with same parameter and same return type
	//runtime polimorphisam
	//class must have is-A relationship to achieve overriding
	
public static void main(String[] args) {
	Annn a=new Annn();
	a.response("class A");
	Annn b=new B();
	b.response("Class B");
	Annn c=new C();
	c.response("class C");
}
}//real time examples of method overloading and overriding is bank
class Annn{
	public void response(String a) {
		System.out.println(a);
	}
}
class B extends Annn{
	@Override
	public void response(String a) {
		System.out.println(a);
	}	
}
class C extends B{
	@Override
	public void response(String a) {
		System.out.println(a);
	}
}

