package in.com.Intereface;

public class Businessman extends Person implements Richman , SocialWorker {

	private String name;
	private String address;
	
	public Businessman(String name,String address) {
	this.name =name;
	this.address =address;  
	}
	@Override
	public void helpToOther() {
		System.out.println("help to other");
	}

	@Override
	public void earnmoney() {
		System.out.println("earn money");
	}
    @Override
	public void donation() {
		System.out.println("giving donation");
		
	}

	@Override
	public void party() {
		System.out.println("party");
	}
			public static void main(String[] args) {
				
				Businessman b = new Businessman("ram","indore");
				System.out.println("name :"+b.name);
				
			System.out.println("address :"+b.address);
			b.earnmoney();
			b.donation();
			b.party();
			b.helpToOther();
			}
}
