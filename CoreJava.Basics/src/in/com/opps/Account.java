package in.com.opps;

public class Account {

	private String number;
	private String accountType;
	private double balance;
	private String AccountType;
	private Object deposit;
	private double amount;

	public String getNumber() {
		return number;
	}
                                                                                                                                                                                                                                                        
	public void setNumber(String number) {
		this.number = number;

	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccounttype(String AccountType) {
		this.AccountType = AccountType;

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
       balance =balance - amount;
       
	}
	  public void withdrawal(double amount) {
       balance =balance -amount;
}

}