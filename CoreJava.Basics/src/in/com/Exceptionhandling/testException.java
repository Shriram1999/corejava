package in.com.Exceptionhandling;

public class testException {

	

	public static void main(String[] args) {
		
		
		try {
			//String s = "java";
			//System.out.println(s.charAt(5));         //*Exception ke aage ka code run nhi hota h //
		
			
			double div =25/0;
			System.out.println(div);
			
			String s1 = "java";
			
			System.out.println(s1.charAt(5));
		}
		catch (ArithmeticException e) {
			System.err.println("zero se divide nhi kr skte");
		}catch (StringIndexOutOfBoundsException a) {
	System.out.println("String java chhota h");
		
		
		}finally {
			System.out.println("i am finally");{
		}
		
		}		
		
		}
	}
	



