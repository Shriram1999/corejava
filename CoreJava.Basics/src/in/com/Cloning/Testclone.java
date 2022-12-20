package in.com.Cloning;

public class Testclone {

	public static void main(String[] args)throws CloneNotSupportedException {
			
		Address a = new Address();               // Address
		a.setCity("indore");
		a.setState("mp");
		
		Employ e = new Employ();                // Employ
   
       e.setId(1);
	   e.setAddress(a);
	   e.setName("Ram");
	
	
	Employ e1 = (Employ) e.clone();                  //cloning Employ
	
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getAddress().getCity());
	System.out.println(e.getAddress().getState());
	
	System.out.println();
	
	System.out.println(e1.getId());
	System.out.println(e1.getName());
	System.out.println(e1.getAddress().getCity());
	System.out.println(e1.getAddress().getState());
	
	
	
	
	
	
	
	
	
	
	
	}

}
