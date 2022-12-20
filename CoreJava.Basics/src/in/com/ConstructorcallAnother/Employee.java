package in.com.ConstructorcallAnother;

public class Employee extends person {

	private String designation;
	
	public Employee() {
	
		System.out.println("Employee default constructor");                   // Default constructor//
	}
	public Employee(String FN ,String Ln,String desi) {      //public Employee(String FN ,String Ln,String desi) {
		
	                                                           //	super();
		
		                                                       // designation =desi;
		                                                     // System.out.println("03 Employee parameter:" +FN +Ln+designation);
	                                                         // }
		super(FN ,Ln);
		
		designation =desi;
		System.out.println("03 Employee parameter:" +FN +Ln+designation);
	}
	public static void main(String[] args) {
		
		Employee E =new Employee("ram:" ,"patel:" ,"developer");

}
}	