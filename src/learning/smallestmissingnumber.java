package learning;

import java.util.Arrays;
import java.util.List;

public class smallestmissingnumber {
	public static int returnmissingsmallestinterger(Integer arr[],int begin,int end) {
		if(begin>end)
			return end+=1;
		if(begin != arr[begin])
			return begin;
		int mid=(begin+end)/2;
		if(arr[mid]==mid)
			return returnmissingsmallestinterger(arr,mid+1,end);
		return returnmissingsmallestinterger(arr,begin,mid);
//		int j;
//		for( j=0;j<=end;j++) {
//			if(arr[j]!=j) {
//				return j;
//			}
//		}
//		return j;
	}

	public static void main(String[] args) {
		System.out.println("Enter numbers to array");
		Integer[] num= {1,4,3,0,6,5};
		int temp;
		for(int i=0;i<=num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}
		}
			List<Integer> n=Arrays.asList(num);
			n.stream().forEach(x->System.out.println(x));
			System.out.println("The first missing smallest number is "+returnmissingsmallestinterger(num,num[0],num.length-1));

	}

}
