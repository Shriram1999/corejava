package in.com.collectionmethods;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Linkedhash{
	
	public static void main(String[] args) {
		
		Set l =new LinkedHashSet ();
		
		l.add(6);
		l.add(1);
		l.add(2);
		l.add(3);                        // jis order me value di h  us order me hi aayegi  // 
		l.add(4);
		l.add(6);                           
		l.add(5);                     
		l.add(7);
		l.add(8);                    
		l.add(9);
		//l.remove(3);
		//l.addAll(l);
		System.out.println(l);
	}
	
	
}
