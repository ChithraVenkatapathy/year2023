package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arraylist {

	public static void main(String[] args) {
		List<String> listofarray=new ArrayList<String>();
		listofarray.add("add");
		listofarray.add("add1");
		listofarray.add("add2");
		listofarray.add("add3");
		for (String add : listofarray) {
			System.out.println(add);
		}
		ArrayList<String> ar=new ArrayList<>();
		ar.add("er");
		ar.size();
		String[] arr= {"asd","asd1","asd2","asd3"};
		List<String> ln=new ArrayList<>();
		for (String add : arr) {
			ln.add(add);
			System.out.println(add);
		}
		//System.out.println("Stream "+ ln.stream().s);
		//
		//String[] res1=ln.toArray(new String[3]);
		String[] res=ln.toArray(new String[ln.size()]);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
		List<Integer> intnum=new ArrayList<>();
		intnum.add(23);
		intnum.add(45);
		intnum.add(56);
		intnum.add(9);
		//for(int i=0;i<=intnum.size();i++) {
			System.out.println(intnum);
		//}
		//it will sort all the collections
		Collections.sort(intnum);
		for (Integer intnu : intnum) {
			System.out.println(intnu);
		}
	}

}
