package java8features;

import java.util.Optional;

public class optional {

	public static void main(String[] args) {
		Optional<Integer> op=Optional.ofNullable(2);
		System.out.println(op.orElse(null));
		Optional<String> op1=Optional.of("res");
		 System.out.println(op1.get());
		Optional<String> op3=Optional.empty();
		System.out.println(op3);
		System.out.println(op1.filter(x->x.contains("res")).get());
		System.out.println(op1.filter(x->x.contains("rs")));
		if(op3.isPresent()) {
			System.out.println("is not empty");
		}else System.out.println("yes empty");
		System.out.println(op3.of(null));
		}
	

}
