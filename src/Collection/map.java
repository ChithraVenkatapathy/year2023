package Collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class map {

	public static void main(String[] args) {
	Map<Integer,String> mapname=new HashMap<Integer,String>();
	
	Map<Integer,String> mapname1=new TreeMap<>();
	Map<String,Integer> maptr=new LinkedHashMap<String,Integer>();
	maptr.put("w", 2);
	maptr.put("d", 2);
	maptr.put("a", 2);
	maptr.put("g", 2);
	maptr.put("h", 2);
	for(Map.Entry<String, Integer> map:maptr.entrySet()) {
		System.out.println(map.getKey() +" "+map.getValue());
	}
	mapname.put(new Integer(11), "key");
	mapname.put(new Integer(2), "keys");
	mapname.put(new Integer(33), "key");
	mapname.put(new Integer(4), "key");
	mapname.put(new Integer(1), "key");

	//	System.out.println("key= "+mapname.get(i)+"value= "+mapname.);
		for (Map.Entry<Integer, String> entry : mapname.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());				
			
		}
		
	mapname1.put(3, "");
	mapname1.put(4, null);
	mapname1.put(1, "data");
	mapname1.put(44, "rata1");
	mapname1.put(5, "data");
	mapname1.put(4, "catawe");
	
	for(Map.Entry<Integer,String> mapn: mapname1.entrySet())
		//mapn.setValue("red");
		System.out.println(mapn.getKey() +" "+mapn.getValue());	
		
	}
	
	//maptr.
	
	

}
