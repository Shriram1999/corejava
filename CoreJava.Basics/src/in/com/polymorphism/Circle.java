package in.com.polymorphism;

public class Circle extends Shape {

	private int radius;
	

    public Circle() {
    }
	
	public Circle(int radius) {
	
		this.radius =radius;
	}
	
	public int getColor(int radius ) {
	return radius;
	
	/*public int getColor(String c ,int b,int radius ) {
		super (c,b);
		return radius;*/
	
	}	
	public double area() {
		
	double c =PI*radius*radius;
	return c;
	
	}
	}