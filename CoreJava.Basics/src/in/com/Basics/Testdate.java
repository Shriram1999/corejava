package in.com.Basics;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Testdate {

	public static void main(String[] args) throws ParseException {
		
		Date d =new Date();
		
		
		System.out.println(d);

		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		String nd =sdf.format(d);
		
		System.out.println(nd);
		
		
		String s ="05/10/2022";
	
			Date d1 =sdf.parse(s);
			System.out.println(d1);   
		
		
	}

}
