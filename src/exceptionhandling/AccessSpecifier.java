/**
 * 
 */
package exceptionhandling;
import accessspecifier.*;


/**
 * @author AjithAravindh
 *
 */
public class AccessSpecifier extends protectedspecifier{
	public void main() {
		protectedspecifier po=new protectedspecifier();
		po.i=10;
		//super(po.i);
		//po.
		//super(po.i);
		
	}

	public static void main(String[] args) {
		accessspecifier a= new accessspecifier();
		a.main(null);
		publicaccess p=new publicaccess();
		p.res();
		AccessSpecifier protec=new AccessSpecifier();
		protec.res();
	}

}
