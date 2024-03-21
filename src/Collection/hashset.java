package Collection;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
	HashSet<String> hs=new HashSet<>();
	hs.add("hello");
	hs.add("world");
	hs.add("welcome");
	hs.add("Hello");
	hs.add("Hello");
	System.out.println(hs);
	hs.remove("hello");
	hs.retainAll(hs);
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	if(hs.contains("welcome")){
		System.out.println("it contains");
	}
	String[] res=hs.toArray(new String[hs.size()]);
	for (int i = 0; i < res.length; i++) {
		System.out.println(res[i]);
	}
	//iterator
	Iterator<String> i=hs.iterator();
	while (i.hasNext()) {
		String data = (String) i.next();
		System.out.println(data);
	}
	}
	
	

}
