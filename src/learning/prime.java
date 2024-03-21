package learning;
import java.util.*;

public class prime {
@SuppressWarnings("resource")
public static void main(String args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter number to check prime or not");
	
	int num=sc.nextInt();
	int num2 = 0;
	fed:
	while(num<=1) {
			System.out.println("Number must be greather than one");
		System.out.println("please enter number to check prime or not");
		
		continue fed;
		//sc1.close();
	}
	
	//sc.close();
	if(num<=0||num==1||num2>=0||num2==1) {
		System.out.println("error occured. please enter values greather than one");
	//	System.err.println("error occured. please enter values greather than one");
	}
	int i,m;
	Boolean flag=false;
	m=num/2;
	for(i=2;i<m;i++) {
		if(num % i==0) {
			flag=true;			
		}
	}
	if(!flag) {
		System.out.println("entered number is prime");
	}else
		System.out.println("entered number is not prime");
	
	System.out.println("enter first number");
	Scanner sc1=new Scanner(System.in);
	num2=sc1.nextInt();
	System.out.println("enter second number");
	Scanner sc2=new Scanner(System.in);
	int num3=sc2.nextInt();
	System.out.println("number of prime between "+num2 +" and "+num3);
	
	for(int in=num2;in<=num3;in++) {
		if(checkprime(in)) {
			System.out.println(in);
		}
	}
	
}
public static Boolean checkprime(int in) {
	int is=0;
	for( is=5;is<=Math.sqrt(in);is++) {
		if(in % 2 == 0) {
			return false;
		}
		if(in % 3 == 0) {
			return false;
		}
		if(in % is+1==0|| in%is+2==0)
			return false;
		
	}
	return true;
	
	
}
public static void main(String[] args) {
	System.out.println("enter number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	sc.close();
	int i=num/2;
	Boolean flag=true;
	for(int j=2;j<=i;j++) {
		if(num % j ==0) {
			flag=false;
		}
		
	}
	if(flag) {
		System.out.println("entered number is prime");
	}else System.out.println("entered number is not prime");
	//Scanner sc1=new Scanner(System.in);
	int num1=12,num2=25;
	int be,end=0;
	//int n=num1/2;
	//Boolean mflag=true;
	for( be=num1; end<=num2;be++) {
		for(int m=2;m<=be/2;m++) {
			if(be%m==0 ) {
			//	mflag=false;
			}else System.out.println(be);
		}
			
	}
}
}
