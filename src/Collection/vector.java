package Collection;

import java.util.Vector;

public class vector {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		 v.add("one");
		 v.add("two");
		 v.addElement("three");
		 v.addElement("four");
		 v.add("five");
		 v.addElement("six");
		 v.add("seven");
		 v.set(6, "sip");
		 System.out.println(v.capacity());
		 for (String res : v) {
			System.out.println(res);
		}
		 
		 Vector vec=new Vector<>();
		 vec.add("add");
		 vec.add(2);
		 vec.add(true);
		 vec.add(2.3f);
		 for (Object object : vec) {
			 System.out.println(object);
		}
		 
		 
		 
	}


}
