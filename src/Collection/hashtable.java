package Collection;


import java.util.*;

enum name{
	 id,name,address,phonenumber;
};
public class hashtable {
 
	public static void main(String[] args) {
	
		Hashtable<Integer,String> hm=new Hashtable<>();
		hm.put(1, "hell");
		hm.put(9, "da");
		hm.put(3, "res");
		hm.put(4, "we");
		hm.put(6, "sd");
		hm.put(3, "");
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		System.out.println(hm.contains("res"));
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue(""));
		System.out.println(hm.isEmpty());
		hm.remove("we");
		hm.remove(3, "res");
		hm.replace(3, "", "red");
		System.out.println(hm.size());
		//iterate via map.entry
		for(Map.Entry<Integer, String> mm: hm.entrySet()) {
			System.out.println("Key="+mm.getKey()+"value="+mm.getValue());
		}
	
	}

}
