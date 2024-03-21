/**
 * 
 */
/**
 * @author AjithAravindh
 *
 */
package accessspecifier;

class A{
	private String A="private";
public A() {
	System.out.println(A);
}
	private void res() {
		System.out.println("private package");
	}	
	
}
	 class B{
	String B="Default or package private";
	void res() {
		System.out.println("default or package private");
	}
}
 class C{
	 static String className="";
	protected String c;
	public String we="";
	protected void resC() {
		System.out.println(c);
		we="welcome";
		System.out.println(className=getClass().getName());
		System.out.println("protected package");
	}
	
}
 class D extends C{
	public String D;
//	C c=new C();
//
//	super(c.)
	public void res() {
		System.out.println(D);
		System.out.println("accessing protected through subclass outside package via method");
	}
}
  class El{
	public String E="public";
	public void res() {
		System.out.println("public");
	}
}
public class accessspecifier{
	
	public static void main(String args[]) {}
	
	A pri=new A();
	
	B def=new B();
	C pro=new C();
	
	
	D sub=new D();
	//E pub=new E();
	//pub.res();
	El e=new El();
	//e.res();

}
