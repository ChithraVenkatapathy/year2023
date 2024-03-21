package predefinedmethod;

class singletonMainclass {
	// singletonMainclass=classname
	private static singletonMainclass INTIATION=null;
	
	public String res="";
	
	private singletonMainclass(){
		res="Hello this is singleton class";
	}
	//need to give synchronized
	//singletonMainclass -return type
	public static synchronized singletonMainclass response() {
		if(INTIATION == null) {
			INTIATION=new singletonMainclass();
		}
		return INTIATION;
	}

}

public class singletonclass {
	public static void main(String[] args) {
		singletonMainclass sm=singletonMainclass.response();
		System.out.println(sm.hashCode());
		singletonMainclass sm1=singletonMainclass.response();
		System.out.println(sm1.hashCode());
		singletonMainclass sm2=singletonMainclass.response();		
		System.out.println(sm2.hashCode());
		System.out.println(sm.res);
		System.out.println(sm1.res);
		System.out.println(sm2.res);
		sm.res="hello this is main class";
		System.out.println(sm.res);
		System.out.println(sm1.res);
		System.out.println(sm2.res);
		sm2.res="Understood about singleton class";
		System.out.println(sm.res);
		System.out.println(sm1.res);
		System.out.println(sm2.res);
	}
}


