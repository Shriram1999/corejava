package in.com.collectionmethods;

public class Hashcode_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s ="java";
	
		System.out.println(s.hashCode());
		                                     // obj ki value same toh Hashcode same //
		String s1 ="java";                     
		                                      //obj ko uniqe calculate krta h //
		System.out.println(s1.hashCode());
	}

}
