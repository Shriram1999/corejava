package in.com.inheritance;

public class Testshapes {

	public static void main(String[] args) {
	
     
	Circle c =new Circle() ;
		
		c.setColor("black");
		c.setRadius(5);
		c.setBorderwidth(5);
		System.out.println("circle color:"+c.getColor());
	 	System.out.println("circle radius:"+c.getRadius());
		System.out.println("circle borderwidth:"+c.getBorderwidth());
	c.area();

//  System.out.println();

   Rectangle r =new Rectangle();
    r.setColor("blue");
    r.setBorderwidth(25);
    r.setLength(10);
    r.setWidth(2);
  System.out.println("Rectangle color:"+r.getColor());
  System.out.println("Rectangle borderwidth:"+r.getBorderwidth());
  System.out.println("Rectangle length:"+r.getLength());
  System.out.println("Rectangle width:"+r.getWidth());
  r.area();
  
  System.out.println();
  
  Triangle t =new Triangle();
  t.setColor("red");
  t.setBorderwidth(14);
  t.setBase(15);
  t.setHight(12);
  System.out.println("Triangle color"+t.getColor());
  System.out.println("Triange borderwidth:"+t.getBorderwidth());
  System.out.println("Triangle base:"+t.getBase());
  System.out.println("Triangle higth:"+t.getHight());
  t.area();
  
  
  
  
  
  
  
  
}

	
	
	
	
	
	
}