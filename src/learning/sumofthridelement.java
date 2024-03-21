package learning;

import java.util.*;


public class sumofthridelement {
	
	public enum depType{
		IT,HR,Tester,Develop;
	}

	public static void main(String args []) {
		System.out.println("main started");
		int a=Integer.parseInt("1");
		System.out.println(a);
		Double d=10.0/0.0;
		System.out.println(d);
		Double f=0.0/0.0;
		System.out.println(f);
		Double e=0/12.0;
		System.out.println(e);
		System.out.println(d.isNaN());
		System.out.println(d.isInfinite());
		System.out.println(f.isNaN());
		System.out.println(f.isInfinite());
		System.out.println(e.isNaN());
		System.out.println(e.isInfinite());
		
		HashMap<String, ArrayList<Integer>> hmIT=new HashMap<>();
		ArrayList<Integer> itIT=new ArrayList<>();		
		itIT.add(12000);
		itIT.add(120034);
		itIT.add(34334);
		itIT.add(45678);
		itIT.add(55000);
		hmIT.put("IT", itIT);
		
		HashMap<String, ArrayList<Integer>> hmHR=new HashMap<>();
		ArrayList<Integer> itHR=new ArrayList<>();		
		itHR.add(12000);
		itHR.add(120034);
		itHR.add(34334);
		itHR.add(45678);
		itHR.add(55000);
		hmHR.put("HR", itHR);
		
		HashMap<String, ArrayList<Integer>> hmDeveleop=new HashMap<>();
		ArrayList<Integer> itDev=new ArrayList<>();		
		itDev.add(12000);
		itDev.add(120034);
		itDev.add(34334);
		itDev.add(45678);
		itDev.add(55000);
		hmDeveleop.put("Develop", itDev);
		
		HashMap<String, ArrayList<Integer>> hmTest=new HashMap<>();
		ArrayList<Integer> itTest=new ArrayList<>();		
		itTest.add(12000);
		itTest.add(120034);
		itTest.add(34334);
		itTest.add(45678);
		itTest.add(55000);
		hmTest.put("Tester", itTest);
		
		Collections.sort(itTest);
		Collections.sort(itDev);
		Collections.sort(itHR);
		Collections.sort(itIT);
		
		
		//Scanner scanner;
		Scanner sc=new Scanner(System.in);
		String type=sc.nextLine();
		sc.close();
		//sc.close();
		
		switch(type){			
			case "Develop":
				System.out.println(itDev.get(itDev.size()-3));
				for	(Map.Entry<String, ArrayList<Integer>> mm: hmDeveleop.entrySet() ) {
					System.out.println(mm.getKey()+" "+mm.getValue());	
					ArrayList<Integer> set=mm.getValue();
					int thirdhighestnumber=set.get(2);
					System.out.println(thirdhighestnumber);		
					
				}
				break;
			case  "Tester":
				for	(Map.Entry<String, ArrayList<Integer>> mm: hmTest.entrySet() ) {
					System.out.println(mm.getKey()+" "+mm.getValue());	
					ArrayList<Integer> set=mm.getValue();
					int thirdhighestnumber=set.get(2);
					System.out.println(thirdhighestnumber);			
					
				}
				break;
			case "IT":
				for	(Map.Entry<String, ArrayList<Integer>> mm: hmIT.entrySet() ) {
					
					System.out.println(mm.getKey()+" "+mm.getValue());		
					ArrayList<Integer> set=mm.getValue();
					int thirdhighestnumber=set.get(2);
					System.out.println(thirdhighestnumber);
					
				}
				break;
			case "HR":
				for	(Map.Entry<String, ArrayList<Integer>> mm: hmHR.entrySet() ) {
					System.out.println(mm.getKey()+" "+mm.getValue());	
					ArrayList<Integer> set=mm.getValue();
					int thirdhighestnumber=set.get(2);
					System.out.println(thirdhighestnumber);		
					
				}
				break;
		 default:
				System.out.println("Please enter valid department type");
				break;
		}
		
		
		
		
				
		
		
		
		
	}
}
