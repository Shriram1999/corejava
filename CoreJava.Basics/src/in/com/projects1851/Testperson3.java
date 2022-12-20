package in.com.projects1851;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testperson3  {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dob = sdf.parse("27/06/2000");

		Person3 x = new Person3("Ram patel", "khargone", dob);

		System.out.println(x.getname());
		System.out.println(x.getaddress());
		System.out.println(sdf.format(x.getdob()));

		AccountConstructor a = new AccountConstructor("9926436154", "saving", 1000);
		a.withdrawal(200);
		a.deposit(100);
		a.fundTransfer(50);
		a.payBill(30);
		System.out.println();
		System.out.println(a.getaccounttype());
		System.out.println(a.getbalance());
		System.out.println(a.getnumber());
	
	
	Automobile3 c = new Automobile3( "Black","Audi",150);
	c.accelerator(150);;
	System.out.println(  );
	
	
	
	
	}

}
