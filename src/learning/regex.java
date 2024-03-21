package learning;
import java.util.regex.*;

public class regex {

	public static void main(String[] args) {
		
		boolean pn=Pattern.compile("\\D").matcher("A").matches();
		System.out.println(pn);//true1
		
		System.out.println(Pattern.matches("[A-Z]*", "ABC"));//true2
		System.out.println(Pattern.matches("[A-Z&&[^MN]]*", "MN"));//false3
		
		System.out.println(Pattern.matches("[A-Z[M-O]]", "N"));//true4
		System.out.println(Pattern.matches("[a-zA-Z&&[^P-Q]]", "pq"));//false5
		System.out.println(Pattern.matches("[XYN]?", "X"));//true6
		System.out.println(Pattern.matches("\\d", "1234R"));//false7
		System.out.println(Pattern.matches("\\D", "ERD1"));//false8
		System.out.println(Pattern.matches("\\s", " "));//true9
		System.out.println(Pattern.matches("\\S", " "));//false10
		System.out.println(Pattern.matches("\\w", "hell0"));//false11
		System.out.println(Pattern.matches("[XYZ]?", "XXM"));//false12
		System.out.println(Pattern.matches("[xyz]+", "xxxyyxzzM"));//13false
		System.out.println(Pattern.matches("[xyz]*", "xxxxZZMM"));//14false
		System.out.println(Pattern.matches(".s", "is"));//true15
		System.out.println(Pattern.matches("..s", "res"));//true16
		System.out.println(Pattern.matches("...rd*", "wwwrd"));//true17
		
	}

}
