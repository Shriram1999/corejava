package in.com.Exceptionhandling;

public class ParentCatchException {

	public static void main(String[] args) {

		String name ="Ram";
	try {
		
    System.out.println("length of name is " +name.length());	
		
    System.out.println("Charter at 6th position is" + name.charAt(5));		
		
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("String abhi chhoti h ");
	}catch (RuntimeException e) {
		System.out.println("Sundar sa naam nhi h");
	}	
		finally {
		System.out.println("patel hu me");	
		}
		

	}

}
