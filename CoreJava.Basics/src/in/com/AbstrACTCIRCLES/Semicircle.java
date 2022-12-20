package in.com.AbstrACTCIRCLES;

public  class Semicircle extends Shape {

	private int radius;
	
	public Semicircle() {}
		
	
	public Semicircle (int radius) {
		this.radius =radius;	
	}
	public int getradius(){
		return radius;
	
	}
	
	public   double area() {
	double s = (PI*radius*radius)/2;
	return s;
	}
}
