package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {

	
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		Set<String> setl=new LinkedHashSet<>();
		Set<String> ser2=new TreeSet<>();
		
		set.add(null);
		set.add("dab");
		set.add("sd");
		set.add("dab");
		set.add("asc");
		System.out.println(set);
		
		setl.add("Z");
		setl.add("B");
		setl.add("C");
		setl.add("A");
		setl.add("R");
		System.out.println(setl);
		
		ser2.add("");
		ser2.add("dab");
		ser2.add("sd");
		ser2.add("asc");
		ser2.add("dab");
		System.out.println(ser2);
		
		Set<Integer> a=new HashSet<>();
		a.addAll(Arrays.asList(new Integer[] {1,2,3,56,7,8,9}));
		
		Set<Integer> b=new HashSet<>();
		b.addAll(Arrays.asList(new Integer[] {1,3,6,8,45}));
		
		Set<Integer> c=new HashSet<>(a);
		c.addAll(b);
		System.out.println(c);
		c.retainAll(b);
		System.out.println(c);
		c.removeAll(b);
		System.out.println(c);
		
		setl.remove("A");
		System.out.println(setl);
		setl.retainAll(c);
		System.out.println(setl);
	
		
		

	}

}
