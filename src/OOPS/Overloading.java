package OOPS;

 class A{
	 //method name with different parametes and does not care about return type
	 //must happen within same class
	 //complie time polymorphisam
	 
	public static String date(String res) {
		return "method overloading";
	}
	public static String date(String res,String res1) {
		return "mo";
	}
	public static int date(int a) {
		return a;
	}
//	public static double date(String a) {
//		return a;
//	}ambiguity
}
public class Overloading {
	private static void Overloading(String a) {
		System.out.println(a);
	}
	public static int Overloading(int a) {
		return a;
	}
	public static String Overloading(int a,String b) {
		 return a+b;
	}
	
	public static void main(String[] asd) {
		int res=Overloading(3);
		System.out.println(res);
		Overloading("hello");
		String res1=Overloading(23, "age");
		System.out.println();
		System.out.println(res1);
		String rep=A.date("");
		//A.date(1);
		String rep1=A.date(res1, res1);
		int rep3=A.date(res);
		System.out.println(rep);
		System.out.println(rep1);
		System.out.println(rep3);
	}
	//can have any number of main methods but the parameters must be different
	public static void main(String[] qwe,int a ) {
		
	}
	
}
