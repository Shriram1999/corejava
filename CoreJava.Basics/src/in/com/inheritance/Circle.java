package in.com.inheritance;

public class Circle extends Shape {

private int radius;
   

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public void area() {
	
	double  c=Shape.PI*radius*radius;
	System.out.println(c);
}	
	
	
}
