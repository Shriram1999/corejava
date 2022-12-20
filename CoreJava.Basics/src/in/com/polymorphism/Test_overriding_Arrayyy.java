package in.com.polymorphism;

public class Test_overriding_Arrayyy {
public static void main(String[] args) {
	

   Shape[]s =new Shape[3];
   s[0] =new Circle(10);
   s[1] =new Rectangle(5,6);
   s[2] =new Triangle(15,40);
   
   double total = 0;
   for (int i = 0; i < s.length; i++) {
	total =total +s[i].area();
   } 
   System.out.println(total);
   
   
   
   
   
}  
}
