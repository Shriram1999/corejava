package in.com.lambda;

public interface TestCal {

	
	char[] maximum = null;
	char[] minimum = null;

	public static void main(String[] args) {
		
	
		calculation add =(a,b)->{
			System.out.println(a+b);
		}; add.cal(50,60);
		
		
	
		calculation sub = (a,b)->{
			System.out.println(a-b);
		  }; sub.cal(100,50);
		
		
		  calculation mul = (a,b)->{
			System.out.println(a*b);
		};mul.cal(20, 5);
		
		
		calculation div =(a,b)->{
			System.out.println(a/b);
		};div.cal(100, 5);
		
		
		
		calculation max =(a,b)->{
			System.out.println(maximum);
		};max.cal(25, 5);
		
		calculation min =(a,b)->{
			System.out.println(minimum);
		};min.cal(50, 20);
		
		
		
		
		 
		
		
		
		
	}
	  
	
	
	
	
}
