package in.com.basic;

public class testmethod {

	public int add(int a, int b) {

		return a + b;
	}	
	public static void main(String[] args) {
		
	
		testmethod t = new testmethod();

		int c = t.add(10, 15);

		System.out.println(c);
	}
}