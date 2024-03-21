package java8features;

@FunctionalInterface
interface defaultmethod{
	
	public void abstractmethod();
	
	default String say() {
		return "this is default method";
	}
	
}
public class default_staticmethod implements defaultmethod {
public static void main(String args[]) {
	default_staticmethod def=new default_staticmethod();
	
	String res=def.say();
	System.out.println(res);
	def.abstractmethod();
	
}

@Override
public void abstractmethod() {
	System.out.println("overriding the method that inherited from interface");
	
}
}
