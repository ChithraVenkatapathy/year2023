package Collection;

import java.util.*;

public class hashmap {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();
	hm.put(1,"er");
	hm.put(2, "er");
	hm.put(3, "rt");
	hm.put(4, "fg");
	System.out.println(hm);
	HashMap<Integer,String> hm1=new HashMap<>(hm);
	hm1.put(5, null);
	System.out.println(hm1);
	hm1.remove(1);
	hm1.remove(5, null);
	hm1.replace(4, "aa");
	//map.entry<> and mapname.entryset
//	for(Map.Entry<Integer, String> mn:hm.entrySet()) {
//		mn.
//	}
	for(Map.Entry<Integer,String> mm:hm1.entrySet()) {
		System.out.println("Key= "+mm.getKey()+"value= "+mm.getValue());
	}
}
}
