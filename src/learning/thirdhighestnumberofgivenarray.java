package learning;

import java.util.Arrays;

public class thirdhighestnumberofgivenarray {

	public static void main(String[] args) {
		int[] arr= {12,34,45,56,3,123,760,89};
		Arrays.sort(arr);
		int thrid=arr[arr.length-3];
		System.out.println("third biggest element in array "+thrid);
		int val;
		int[] arrnew= {12,34,45,56,3,133,760,89};
		for(int i=0;i<arrnew.length;i++) {
			for(int j=i+1;j<arrnew.length;j++) {
				if(arrnew[i]>arrnew[j]) {
					val=arrnew[i];
					arrnew[i]=arrnew[j];
					arrnew[j]=val;
				}
			}		
			
		}
		System.out.println("And the third highest number is: "+arrnew[arrnew.length-3]);
		for (int i = 0; i < arrnew.length; i++) {
			System.out.println("the sorted array is "+arrnew[i]);
		}

	}

}
