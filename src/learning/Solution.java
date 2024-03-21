package learning;

import java.util.Arrays;


public class Solution {
		public static Boolean firstMissing(int[] arr, int n,int i) {
			
			Arrays.sort(arr);
		//	int mis=0;
			for(int m=0;m<=n;m++){
				
				if(arr[m]==i){
			 	return true;
				}
			}
			return false;
		}
		public static void main(String[] args){
			int[] arr={-34,-345,5,7,1,2,3,4,0};
			int n=arr.length;
			for (int i=0 ; arr.length>=0;i++) {
				if(firstMissing(arr, n,i)==false) {
					System.out.println("the missing first element is "+i);
				}
			}
			
			//System.out.println(firstMissing(arr,n,i));
		}
	}

