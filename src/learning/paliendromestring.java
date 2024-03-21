package learning;
import java.util.*;

public class paliendromestring {
	
	public static void main(String args[]) {
		System.out.println("Enter string to validate paliendrome");
		Scanner sc=new Scanner(System.in);
		String val=sc.nextLine();
		sc.close();
		int length=val.length();
		String reversed = "";
		for(int i=length-1;i>=0;i--) {
			reversed += val.charAt(i);
		}
		if(val.equals(reversed)) {
			System.out.println("given string is paliendrome");
		}else
			System.out.println("given string is not a paliendrome");
		System.out.println("Enter text for paliendrome check in string buffer");
	//	Scanner sb=new Scanner(System.in);
		String rever="wow";
	//	sb.close();
		StringBuffer sBuff=new StringBuffer();
		sBuff.append(rever);
		
		String reverse=sBuff.reverse().toString();
		System.out.println(reverse);
		if(rever.equals(reverse)) {
			System.out.println("given string is paliendrome");
		}else
			System.out.println("given string is not a paliendrome");
		
		
	}

}
