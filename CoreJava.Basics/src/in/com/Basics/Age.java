package in.com.Basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Age {

	public static void main(String[] args) throws ParseException {

		Date today = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date dob = sdf.parse("27/06/2000");

		int a = today.getYear();

		int b = dob.getYear();

		
		int c = a - b;

		System.out.println("Age = " + c);

	}

}
