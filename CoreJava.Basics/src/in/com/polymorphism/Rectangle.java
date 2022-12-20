package in.com.polymorphism;

public class Rectangle extends Shape{
private int length;
private int width;	
	
public Rectangle() {}

public Rectangle(int length,int width) {
	this.length =length;
	this.width =width;
}

public int getLength(int length) {
	return length;
}
public int getWidth(int width) {
	return width;

}
public double area() {
	
	double c =length*length;
	return c;

}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
