package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class array {
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		String[] var=new String[7];
		for (int i = 0; i < var.length; i++) {
			Random rm=new Random();
			var[i]=rm.toString();
		//	System.out.println(var[i]);
		}
		for (int i = 0; i < var.length; i++) {
			System.out.println(var[i]);
		}
		arr[0]= 6;
		arr[1]=22;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		int clonearr[]=arr.clone();
		try {
			for (int i : clonearr) {
				System.out.println(clonearr[i]);
			}	
		}catch(Exception ex) {
			String [] diff=new String[5];
			diff[0]="this ";
			diff[1]="is also ";
			diff[2]="way to ";
			diff[3]="create array";
			System.out.println(diff[0]+" "+diff[1]+" "+diff[2]+" "+diff[3]);
		}
		//it will sort array
		Arrays.sort(clonearr);
		for (int i = 0; i < clonearr.length; i++) {
			System.out.println(clonearr[i]);
		}
		ArrayList<String> listarr=new ArrayList<>();
		listarr.add("pink");
		listarr.add("yellow");
		listarr.add("blue");
		listarr.add("Apple");
		System.out.println(listarr.get(1));
		listarr.remove(2);
		//Arrays.to
		//Arrays.listarr.set(1, "red");
		Collections.sort(listarr);
		for (String listar : listarr) {
			System.out.println(listar);
		}
		
		
	int[][] multi=new int[3][3];
		for(int i=0;i<arr[i];i++) {
			for(int j=0;j<arr[j];j++) {
				multi[i][j]= i;
				System.out.println(multi[i][j]);
			}
		}
		
		
		
	}

}
