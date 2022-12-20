package in.com.Basics;

import java.time.LocalDate;
import java.time.Period;

public class Age1 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		LocalDate dob = LocalDate.of(2000, 6, 27);

		Period diff = Period.between(today, dob);

		
				
		
		System.out.println(diff);

	}

}
