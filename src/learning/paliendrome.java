package learning;

import java.util.Scanner;

import java.util.*;
class A{
	
}
class B extends A{
	
}

public class paliendrome {
	
public static void main(String args []) {
	try {
		List<? super A> l1=new ArrayList<>();
		List<? extends B> l2=new ArrayList<>();
		if(l1.equals(l2) &&  l2.equals(l1)) {
			System.out.println("l1 equals l2");
		}
		//List<String> lm=new ArrayList<>();
		l1.add(new A());
		l1.add(l2.get(0));
		//l2.add(l1.get(0));
		
		
		int aw=2%10;
		System.out.println(aw);
	
		System.out.println("Enter number to test paliendrome");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int remainder,temp,sum=0;
		temp=num;
		while(num>0) {
			remainder=num%10;
			sum=(sum*10)+remainder;
			num=num/10;
		}
		
		if(sum==temp) {
		System.out.println("given number is paliendrome");	
		}else
		System.out.println("given number not paliendrome");
		
		int a=args.length;
		int b=10/a;
		System.out.println(a);
		System.out.println(b);
		
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	
}
}
