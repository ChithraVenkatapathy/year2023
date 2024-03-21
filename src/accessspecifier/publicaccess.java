package accessspecifier;

public class publicaccess {


		public String E="public";
		public void res() {
			System.out.println("public");
		}
	
public static void main(String[] args) {
	publicaccess pa=new publicaccess();
	System.out.println(pa.E);
	//System.out.println();
	pa.res();
}
}
