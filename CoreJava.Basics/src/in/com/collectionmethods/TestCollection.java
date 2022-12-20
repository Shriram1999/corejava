package in.com.collectionmethods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
	
			List li =new ArrayList();
		
		li.add(12);
		li.add(3.6);
		li.add('a');
		li.add("Ram");
	
	 	System.out.println(li);       
		
		                           // by list //
	 	for (Object o:li) {
	
	System.out.println(o);
		           List a =new LinkedList();
	           a.add(23);
	           a.add(56);
	           a.add(89);
	          a.addAll(li);
	         
	         //  a.clear();
	         
	           // System.out.println(a.contains(56));
	       
	           // System.out.println (a.containsAll(a));
	     
	           // System.out.println(a.isEmpty()); ;
	         
	           //System.out.println (a.remove(2));
	          
	           //System.out.println(a.removeAll(li));
	           
	          // a.retainAll();
	           //a.size();
	         System.out.println(a);
	
	}	

	}
}

