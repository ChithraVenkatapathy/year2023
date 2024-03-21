package learning;

import java.util.Arrays;

public class sumofarrays {
	public static void main(String[] args){
	    
	    int[] arr= {2,4,5,78,89,345,4,6,78,9,89,67};
	     int n=arr.length+1;
	     System.out.println(sumOfMaxMin(arr, n));
	   }
	  public static int sumOfMaxMin(int[] arr, int n) {
	   //int[] arr=new int[];
	    // for(int i=0;i<=n;i++){
	    //   arr[i]=i;
	    // }
	    Arrays.sort(arr);
	    int min=arr[0];
	    int max=arr[arr.length-1];
	    int sumOfMaxMin=min+max;
	    return sumOfMaxMin;
	  //  System.out.println(sumOfMaxMin);   
	  }
}

   

