package learning;

import java.util.Arrays;
import java.util.*;

public class interview {

	public static void main(String[] args) {
//		int[] array= {1,4,8,12,3};
//		
//		Arrays.sort(array);
//		
//		for (int i = array.length-1; i >=0 ; i--) {
//			System.out.println(""+array[i]);
//		}
//
//		for (int i = 0; i <array.length-1 ; i++) {
//			System.out.println("ascending"+array[i]);
//		}
		
		String a="java c c++ java";
		//String[] spilt=a.split("java");
		String[] split=a.split(" ");
		int countjava=0;
		int countc=0;
		int countcplus=0;
		for (int i = 0; i < split.length; i++) {
			
			if(split[i].equals("java")) {
				++countjava;
			}else if(split[i].equals("c")) {
				++countc;
			}else if(split[i].equals("c++")){
				++countcplus;
			}
			
		}
		System.out.println("countjava "+countjava+" countc "+countc+" countcplus "+countcplus);
		
		List<String> spi=Arrays.asList(a);
		
	System.out.println( spi.stream().
			filter(x->x.contains("java")).count());
		//System.out.println(count);
//		for (int i = 0; i < spilt.length; i++) {
//			String res = spilt[i];
//			System.out.println(res);
//			
//		}
		//System.out.println(spilt[0]+spilt[1]);
	}
	

	
}
