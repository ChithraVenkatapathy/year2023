package learning;

public class swap {

	
	    public static void swapNumber(int []a,int []b) {
	       
	        int temp=a[0];
	        a[0]=b[0];
	        b[0]=temp;
	       System.out.println(a[0]+" "+b[0]);


	    }
	    public static void main(String[] args){
	        int a[]={1};
	        int b[]={2};
	        swapNumber(a,b);
	    }
	
}
