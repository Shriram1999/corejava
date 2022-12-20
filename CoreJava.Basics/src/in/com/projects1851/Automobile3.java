package in.com.projects1851;

public class Automobile3 {

	private String color;
	private int Speed;
    private String make;
    public static final int NO_OF_GEAR=5 ;
	  
    public Automobile3(String color,String make,int Speed) {	 
	    this.color =color;
    this.make =make;
	 this.Speed =Speed;  
		
    } 
	 public String getcolor() {
			return color;
		}
			public int getSpeed() {
				return Speed;
			}		
				public String make() {
					return make;
				}
					 public Automobile3() {
							System.out.println("this is default constructor");
				   
					 }
					 public void brake(int speed) {
						   
								System.out.println(" car is breaking");	
						   
								
							}
						    public void accelerator(int Speed) {
						    	if (Speed>0) {
									
						    		System.out.println("car is accelerate");
						    	}
						    	else {
						    			
						    	} System.out.println("car is not accelerate");	
                         }

						    public void changeGear (int Speed) {
					
			                  if (Speed>0 && Speed<=20){ 
					
					         System.out.println("first Gear");
			
			                }else if (Speed>20 &&Speed<=40)	{
				             System.out.println("second Gear");
			                
			                }else if(Speed>40 && Speed<=60) {
			                	
			                }else if (Speed>60 && Speed <=80) {
			                	
			                }else if(Speed>80 && Speed<=120) {
			                	
			                }else
			                	System.out.println("Stop");
				
						    }
				
				
				
				
				
						    
					 }						    
						    
						    
						    
				    
						    
						    
						    