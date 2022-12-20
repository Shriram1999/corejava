package in.com.opps;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testperson {

	public static void main(String[] args) throws ParseException {
		
		
		Person p =new Person();
		
		SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
		Date dob = sdf.parse("27/06/2000");
	
		
		p.setdob(dob);
		p.setname("Ram Patel" );
		p.setaddress("khargone");
	
		
		System.out.println(p.getdob());
		System.out.println(p.getname());
		System.out.println(p.getaddress());
	}
   // 
	//#Account a =new Account();
	//a.setNumber("9926436154");	
	//a.setAccounttype("saving");
   // a.deposit(1000);
	//a.withdrawal(500);
	//a.fundTransfer("200");
	//a.payBill(100);
	
   
	//System.out.println(a.getAccountType());
    //System.out.println(a.getNumber());
    //System.out.println(a.getbalance())//

    }  



