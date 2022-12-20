package in.com.collectionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet extends Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Marksheet m1 = new Marksheet();
		      
		     m1.setRoolno("10");
		     m1.setMaths(11);
		     m1.setChemistry(12);
		     m1.setPhysics(13);
		    
		     Marksheet m2 = new Marksheet();

		     m2.setRoolno("65911");
		     m2.setMaths(55);
		     m2.setChemistry(62);
		     m2.setPhysics(44);
		  
		     Marksheet m3 = new Marksheet();

		    m3.setRoolno("19");
		     m3.setMaths(20);
		     m3.setChemistry(22);
		     m3.setPhysics(15);
		  
		     Marksheet m4 = new Marksheet();

		     m4.setRoolno("21");
		     m4.setMaths(5);
		     m4.setChemistry(6);
		     m4.setPhysics(4);
		  
		     Marksheet m5= new Marksheet();

		     m5.setRoolno("11");
		     m5.setMaths(33);
		     m5.setChemistry(2);
		     m5.setPhysics(14);
		  
		     
		     ArrayList l =new ArrayList<>();
		     l.add(m1);
		     l.add(m2);
		     l.add(m3);
		     l.add(m4);
		     l.add(m5);
		     
		    
		     Collections.sort(l);
		     
		     
		 Iterator  it =l.iterator();
		     
		     
		     
		while (it.hasNext()) {
			Marksheet o= (Marksheet) it.next();
			
			
			System.out.println(o.getRoolno() +" "+ o.getChemistry() +" "+ o.getMaths() +" "+ o.getPhysics() );
		
		}     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
		    
		      
		      
		     
		    
	}

}
