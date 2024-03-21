package OOPS;

public class stringbuilder {
public static void main(String[] args) {
	//string buffer and string builder both are mutuable
	StringBuffer sb=new StringBuffer();
	sb.append("hello");
	sb.append(" ");
	sb.append(" World");
	System.out.println(sb);
	char[] rep= {'s','f','g'};
	sb.append(rep);
	sb.append(1);
	
	System.out.println(sb.capacity());
	System.out.println(sb.substring(2));
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	sb.replace(3, 7, "red");
	System.out.println(sb);
	
	StringBuilder sB=new StringBuilder("String");
	sB.append("Builder");
	System.out.println(sB);
	char[] res= {'a','b','c'};
	sB.append(res);
	System.out.println(sB);
	sB.replace(2, 6, "die");
	System.out.println(sB);
	sB.reverse();
	System.out.println(sB);
	sB.toString();
	System.out.println(sB);
	sB.trimToSize();
	System.out.println(sB);
}
}
