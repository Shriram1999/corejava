package in.com.Exceptionhandling;

public class TryCatchException {

	public static void main(String[] args) {        // main method //
		
		String s = null;
	try {	
		System.out.println(s.length());
		System.out.println(s.charAt(5));
	}catch (NullPointerException e) {
		
	//	System.out.println("String is null");        //print message //
		
	System.out.println(e.getMessage());             // predefine massage //
	
	
		
		
		
	}	
		

	}

}
