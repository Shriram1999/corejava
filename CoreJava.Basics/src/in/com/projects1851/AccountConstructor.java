 package in.com.projects1851;

public class AccountConstructor {

	private String number;
	private String accounttype;
	private double balance;
	
	
 public AccountConstructor(String number, String accounttype,double balance) {
	
	this.number = number;
	this.accounttype =accounttype;
    this.balance =balance;

   } 
    public String getnumber() {
		return number;
    }
		public String getaccounttype() {
			return accounttype;
	} 

	
	  public double getbalance() {
		return balance;
	  
	 }
	 
		public void deposit(double amount) {
			balance = balance +amount ;
		}
		public void fundTransfer(double amount) {
	    balance = balance - amount;

	}
		public void payBill(double amount) {
	       balance = balance - amount;
	       
		}
		  public void withdrawal(double amount) {
	       balance =balance - amount;
		
		  }
}

	