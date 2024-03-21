package accessspecifier;

public class protectedspecifier extends C{
	protected String proct;
	public int i=5;
	protected void res() {
		super.we=getClass().getName();
		System.out.println("accessing protected through subclass outside package via method");
	}
	//super(C.)
public static void main(String args[]) {	
protectedspecifier ps=new protectedspecifier();
System.out.println("Response "+ps.we);
ps.res();
ps.resC();
//
}
}
