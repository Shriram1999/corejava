package in.com.opps;

public class automobile {

	private String color;
	private int speed;
	private String make;

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public String getmake() {
		return make;
	}

	public void setmake(String make) {
		this.make = make;
	}

	public int getspeed() {
		return speed;
	}

	public void brake(int speed) {
	    if (speed<20) {
			System.out.println(" car is breaking");	
	 }else {
		System.out.println("car is not breaking");
	}
	}
	  
	    public void accelerator(int speed) {
	    	if (speed>0) {
				
	    		System.out.println("car is accelerate");
	    	}else {
					
	    		{		System.out.println("car is not accelerate");	
	    		
	    	
	    		
	    		
	    		
			}
	    }
	    
	      
	    
	    
}
}