package learning;

public class fabnoci {

	public static void main(String[] args) {
		int numreq=10;
		fab(numreq);		
		System.out.println();
		for(int i=0;i<numreq;i++) {
			System.out.print(fabno(i)+" ");
		}
	}
	public static void fab(int n) {
		int max=0;
		int num1=0,num2=1;
		//int rep=0;
		while(max<n) {
			System.out.print(num1+" ");
			int rep=num2+num1;
			num1=num2;
			num2=rep;
			max=max+1;
		//	System.out.print(rep+" ");
		}
		//return rep;
				
	}
	public static int fabno(int num) {
		
		if(num<=1) {
			return num;
		}
		return fabno(num-1)+fabno(num-2);
	}

}
