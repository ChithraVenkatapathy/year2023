package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("red");
		ll.add("Jaja");
		ll.add("Prni");
		ll.add("bose");
		ll.add("rear");
		
		System.out.println(ll.get(2));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		
		ll.set(2, "new");
		
		System.out.println(ll.size());
		Collections.reverse(ll);
		System.out.println("reverse");
		for (String llstr : ll) {
			
			System.out.println(llstr);
		}
		
		Collections.shuffle(ll);
		System.out.println("shuffle");
		for (String llstr : ll) {
			
			System.out.println(llstr);
		}
		Collections.sort(ll);
		System.out.println("sort");
		for (String llstr : ll) {
			
			System.out.println(llstr);
		}
		Collections.emptyList();
		System.out.println("emptylist");
		for (String llstr : ll) {
			
			System.out.println(llstr);
		}
		//Collections.
		String[] arr= ll.toArray(new String[ll.size()]);
		System.out.println("converted to array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(ll.remove());		
		System.out.println(ll.removeAll(ll));
	
	}

}
