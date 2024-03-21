package learning;
import java.util.*;
@FunctionalInterface
interface inter{
	public void factorial(int fact);
	
	default int fact(int i,int fact) {
		
		for(int n=1;n<=i;n++ ) {
			fact = fact*n;
		}
	//	return fact;
//		int n=5;
//		for(int m=0;m<=n;m++) {
//		 fact=fact*(fact-m);
//		}
		return fact;
		//fact=fact*n;
	}
}

class rest implements inter{

	@Override
	public void factorial(int fact) {
		int n=fact;
		fact=1;
		for(int i=1;i<=n;i++) {
			 fact=fact*i;
		}
		System.out.println(fact);
	}
	
}


public class factorial {
	//int num=5;
	public static void main(String[] args) {
		
		inter x=(num)->{
			System.out.println("calling functional interface");
		};
		rest rest=new rest();
		rest.factorial(5);
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		scan.close();
		int factorial=1;
		System.out.print("the factorial value is: "+x.fact(i,factorial));
		
		
		
	}
	
	
	

}
