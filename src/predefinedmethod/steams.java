package predefinedmethod;

import java.util.*;
import java.util.stream.Collectors;

public class steams {
public static void main(String[] args) {
	//list initalized as arraylist
	List<Integer> li=new ArrayList<>();
	li=Arrays.asList(1,2,3,4,5);
	//list initalized as linkedlist
	List<String> ll=new LinkedList<>();
	ll=Arrays.asList("zneo","atwo","threeo","atwo","five");
	//lamda expressions for filter and 
	ll=ll.stream().filter(s->s.endsWith("o")).collect(Collectors.toList());
	System.out.println(ll);
	//Set<String> snmae
	System.out.println("understanding foreach");
	ll.stream().filter(s->s.contains("o")).
			filter(x->x.endsWith("o")).sorted().forEach(m->System.out.println(m));
	System.out.println(ll);
	//distinct- returns only unique values
	ll=ll.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(ll);
	li.stream().map(x->x+x).forEach(y->System.out.println("X+X=" +y));
	//map for mathematical operations
	Set<Integer> set=li.stream().map(x->x*x).sorted().collect(Collectors.toSet());
	for (Integer ll0 : set) {
		System.out.println(ll0);
	}
	//Two types of java steams.
	//byte stream and character stream
	
	List<Integer> list=new ArrayList<>();
	for (int i = 1; i <= 10; i++) {
		list.add(i);
	}
	list.stream().filter(x->x>=5).forEachOrdered(m->System.out.println(m));
	list.stream().filter(x->x<=5).forEach(x->System.out.println(x));
	//Collections.sort(list);
	int[] in=new int[] {7,8,34,45,65};
	Arrays.sort(in);
//	int res=Arrays.binarySearch(in, 23);
//	System.out.println(res);
	List<String> sort=new LinkedList<String>();
	sort=Arrays.asList("dd","sd","er","aa");
//	List<String> sortedList = sort.stream()
//            .sorted(Comparator.<String>comparingInt(s->Integer.parseInt(s.split(":")[0].trim())).reversed())
//            .collect(Collectors.toList());


	Collections.sort(sort,Comparator.<String>comparingInt(s->Integer.parseInt(s.split(":")[0].trim())).reversed());
}
}
