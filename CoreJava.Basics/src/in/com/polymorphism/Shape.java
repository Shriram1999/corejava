package in.com.polymorphism;

public class Shape {
private String color;
private int borderwidth;
public static final float PI=(float)3.14;
	
	
	public Shape(){
		
	}
	public Shape(String color  , int borderwidth) {
		this.color =color;
		this.borderwidth =borderwidth;
	}
	public String getColor(String color) {
		return color;

	}	
	public int getBorderwidth(int borderwidth) {
		return borderwidth;
	}
	public double area() {
		return 0;
		
	}
		
}
	
	
	

