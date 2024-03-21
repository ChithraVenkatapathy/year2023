package java8features;
//refere a method as functional interface
//compact and easiest form of method reference
interface method{
	public String say();
}
public class methodreference {
	public static String refer() {
		return "hello";		
	}
	public String instance() {
		return "instance method";
	}
	
	public static void main(String args[]) {
		//3 types of method reference
		//reference to a static method
		//reference to a Instance method;
		
		////static method reference
		method met=methodreference::refer;
		System.out.println(met.say());
		//instance method reference
		methodreference meth=new methodreference();
		method method=meth::instance;
		System.out.println(method.say());
	}

}
