package in.com.Encapsulation_oop;

public class Shape {
	 
	
	//private me jo h wo shape ke members h Attributes ke//
	
	private String color = null;
	private int borderwidth = 0;

	
	// or ye baki public wale sb members ki methods h// 
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	

}
