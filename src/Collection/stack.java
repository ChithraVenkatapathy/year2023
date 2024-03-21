package Collection;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		st.add("this");
		st.add("is");
		st.add("new");
		st.add("stack");
		System.out.println(st.capacity());
		System.out.println(st.firstElement());
		System.out.println(st.lastElement());
		System.out.println(st.peek());
		System.out.println(st.pop());
		st.push("hello");
		st.set(3, "red");
		System.out.println(st.search("new"));
		Stack sts=new Stack();
		sts.add("one");
		sts.add("two");
		sts.add("three");
		sts.add("five");
		System.out.println(sts);
		String[] res=st.toArray(new String[st.size()]);
		for (String re : res) {
			System.out.println(re);
		}

	}

}
