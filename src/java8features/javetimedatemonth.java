package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//one of the java8 features

public class javetimedatemonth {
public static void main(String args[]) {
	LocalDate localdate=LocalDate.now();
	LocalTime localTime=LocalTime.now();
	LocalDateTime localDateTime=LocalDateTime.now();
	System.out.println( localdate);
	System.out.println( localTime);
	System.out.println( localDateTime);
}
}
