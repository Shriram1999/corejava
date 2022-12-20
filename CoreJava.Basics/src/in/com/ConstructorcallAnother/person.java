package in.com.ConstructorcallAnother;

public class person {

	private String FirstName;
	private String LastName; 
	private String Address;
	private int age;
	
    public person() {
	System.out.println("Person DEfault Constructor");    // Constructor//
}
	public person(String FN,String Ln) {
		FirstName =FN;
		LastName=Ln;
		
		System.out.println("Person 2 parameter "+FN+Ln);
				
	}
	public person(String FN,String Ln,String Add) {
		this(FN,Ln);
		Address=Add;
		System.out.println("Person 3 parameter "+FN+Ln+Add);
	}
	
	public person(String FN,String Ln,String Add,int age) {
		this(FN,Ln,Add);
		age = age;
		System.out.println("Person 4 parameter "+FN+Ln+Add+age);
	}
	
	public static void main(String[] args) {
		
		person p =new person("  ram :"," Patel :"," indore:",22);
		
		
	}
}


