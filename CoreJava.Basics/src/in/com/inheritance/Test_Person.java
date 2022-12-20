package in.com.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_Person {

	public static void main(String[] args) throws ParseException {
		
		
		Person p =  new Person();
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		Date dob = sdf.parse("27/06/2000");
		
		p.setName("Ram");
		p.setAddress("indore");
		p.setDob(27/06/2000);
		 System.out.println(p.getName());
		 System.out.println(p.getAddress());
		 System.out.println(p.getDob());
		 
		 
		 System.out.println();
		 
		 
		 Businessman b = new Businessman();
				 
		 b.setIncome(50000); 
		 System.out.println(" income :" + b.getIncome());
		
		 
		System.out.println("doctor");
		 
		 Doctor d = new Doctor();
		 
		 d.setRegistrationNo("25");		 
		 System.out.println("RegistrationNo:"  + d.getRegistrationNo());
		 
		 
		System.out.println(); 
		 
		 Student s =new Student();
		 
		 s.setRoolno("196");
		 s.setMarks(59);
		 System.out.println("rool no:" + s.getRoolno());
		 System.out.println("marks:" + s.getMarks());
		 
		 
	}

}
