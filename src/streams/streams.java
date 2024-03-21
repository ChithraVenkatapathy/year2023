package streams;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streams {

	public static void main(String[] args) {
		List<String> lname=new ArrayList<String>();
		lname.add("sathamhussain");
		lname.add("sathamhussain");
		lname.add("chithra");
		//find the duplicatess
		//lname.stream().filter(y->y.length()>0).forEach().;
		System.out.println(lname.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		//System.out.println(lname.stream().collect(Collectors.(Function.identity(),Collectors.counting())));
		System.out.println(lname.stream().filter(x->x.equals("sathamhussain")).count());
		System.out.println(lname.stream().filter(x->Collections.frequency(lname,x)>1).collect(Collectors.toSet()));

	}

}
