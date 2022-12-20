package in.com.opps;

public class TestAccount {

	
	public static void main(String[] args) {
		
		Account a =new Account();
		a.setNumber("9926436154");	
		a.setAccounttype("saving");
	    a.deposit(1000);
		a.withdrawal(500);
		a.fundTransfer(200);
		a.payBill(100);
		
		
		System.out.println(a.getAccountType());
	    System.out.println(a.getNumber());
	System.out.println(a.getbalance());
	
	}	
}
