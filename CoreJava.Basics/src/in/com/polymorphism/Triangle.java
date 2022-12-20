package in.com.polymorphism;

public class Triangle extends Shape{


  private int base;
   private int higth;
//private int hight;
	
	public Triangle() {
		
	}
	public Triangle(int base,int higth) {
	this.base =base;
	this.higth =higth;
}
	public int getBase(int base) {
		return base;	
	}
	public int getHigth(int higth) {
		return higth;
	}
	public double area() {
		
		
		double c =base*higth/2;
		return c;
		
}
}