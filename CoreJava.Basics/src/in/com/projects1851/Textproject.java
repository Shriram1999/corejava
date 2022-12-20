package in.com.projects1851;

import java.text.ParseException;

public class Textproject {

	public static void main(String[] args) throws ParseException {
		
		AccountConstructor a = new AccountConstructor("9926436154", "saving", 1000);
		a.withdrawal(200);
		a.deposit(100);
		a.fundTransfer(50);
		a.payBill(30);
		System.out.println();
		System.out.println(a.getaccounttype());
		System.out.println(a.getbalance());
		System.out.println(a.getnumber());
	//System.out.println(a.withdrawal(0));;
		
		
		

	}

}
