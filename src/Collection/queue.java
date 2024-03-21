package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
	public static void main(String[] args) {
		Queue<Integer> que=new LinkedList<>();
		Queue<String> qu=new PriorityQueue<>();
		qu.add("this");
		qu.add("is");
		qu.add("queue");
		qu.add("collections");
		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.poll());
		qu.remove("is");
		System.out.println(qu.size());
		System.out.println(qu);
		String[] arr=qu.toArray(new String[qu.size()]);
		for (String arri : arr) {
			System.out.println(arri);
		}
	}

}
