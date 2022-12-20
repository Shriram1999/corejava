package in.com.polymorphism;

public class Test_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s = new Circle(10);    //Circle c = (Circle)s;   c.area();  s.area();
	    Shape x = new Triangle(15, 40);
		Shape n = new Rectangle(5, 6);
        
	
		
		System.out.println(s.area());
		System.out.println(x.area());
		System.out.println(n.area());
	}
}