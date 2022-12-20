package in.com.basic;

public class buffer {

	public static void main(String[] args) {

		String s1 = new String("Ram");
		String s2 = new String("Rama");
		boolean result1 =(s1 == s2);
		boolean result =(s1.equals(s2));

		System.out.println(result);//address
		System.out.println(result1);//value

	}

}
