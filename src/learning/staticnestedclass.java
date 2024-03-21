package learning;

public class staticnestedclass {
	
	int i=23;
	String data="hello";
    static String datas="welcome";
    static Double rep=12.5;
	static class innerclass{
		public static void res() {
			System.out.println(" "+datas);
			System.out.println("Double value "+rep);
			staticnestedclass snc=new staticnestedclass();
			System.out.println("String value "+snc.data);
			System.out.println("integer value "+snc.i);
		}
	}

	public static void main(String[] args) {
		
		staticnestedclass.innerclass inner=new staticnestedclass.innerclass();
		inner.res();
		staticnestedclass.innerclass.res();
	}

}
