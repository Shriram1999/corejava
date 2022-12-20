package in.com.basic;

public class Sbuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Vijay");
		sb.append("DinanathChouhan");

		for (int i = sb.length() - 1; i >= 0; i--) {

			System.out.print(sb.charAt(i));

		}

		// System.out.println("Length :" + sb.length());

		// System.out.println("Capacity :" + sb.capacity());

		// System.out.println("Replace:" + sb.replace(14, 22, "Jay"));

		// System.out.println("index of:" + sb.indexOf("b"));

		System.out.println("Reverse:" + sb.reverse());

		// System.out.println("Char at:" + sb.charAt(1));

	}
}
