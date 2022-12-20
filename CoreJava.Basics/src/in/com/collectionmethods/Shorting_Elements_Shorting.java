package in.com.collectionmethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Shorting_Elements_Shorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		ArrayList<Integer> a = new ArrayList<>();
		
		    a.add(12);
		    a.add(15);
		    a.add(10);
		    a.add(3);
		    a.add(8);
		    
		 System.out.println(a);   
	                                // Shorting  //
		 Collections.sort(a);
		 System.out.println(a);
	}

}
