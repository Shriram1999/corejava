package in.com.AbstrACTCIRCLES;

public abstract class Shape {

	private String color;
	private int borderwidth;
public static final float PI=(float)3.14;
	
	
	public Shape(){
		//System.out.println("default constructor");
	
	}
	public Shape(String color  , int borderwidth) { //*Constructor*//
		this.color =color;
		this.borderwidth =borderwidth;
	}
	public String getColor(String color) {
		return color;

	}	
	public int getBorderwidth(int borderwidth) {
		return borderwidth;
	}
	public abstract double area();
		
	
	
}
