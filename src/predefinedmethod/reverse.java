package predefinedmethod;

import java.util.Scanner;

public class reverse {
	
		public static String rerver(String str) {
			//	char[] actual = str.toCharArray();
				String reverse="";
				for(int i=str.length()-1;i>=0;i--) {
					 reverse += str.charAt(i);		
				}
				return reverse;
				
			}
			@SuppressWarnings("unused")
			public static void main(String args[]) {
				try {
					System.out.println("enter your name");
					Scanner scan=new Scanner(System.in);
					String resp=scan.nextLine();
					scan.close();
				   char[] res=resp.toCharArray();
					StringBuffer reverse=null;
					StringBuffer sb=new StringBuffer();
					sb.append(resp);
					reverse=sb.reverse();
					System.out.println(reverse);
					
					StringBuilder sBu=new StringBuilder();
					sBu.append(resp);
					StringBuilder reversebuild=null;
					reversebuild=sBu.reverse();
					
					System.out.println("Builder " +reversebuild);
					
					String rev="";
//					
//					for(int i=resp.length();i>=0;i--) {
//						rev += resp.charAt(i);		
//					}
					
					System.out.println(rev);
					System.out.println(rerver(resp));
				}catch(Exception ex) {
				}
				
			}	
}
