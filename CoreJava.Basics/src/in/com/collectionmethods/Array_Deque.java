package in.com.collectionmethods;

import java.util.ArrayDeque;

public class Array_Deque {

	
	
	public static void main(String[] args) {
		
	ArrayDeque d = new ArrayDeque();
				
			d.add(1);
			d.add(2);	
			d.add(3.2);	
			 	   
			d.addFirst(5);       // value ko rakhna first me
			d.addLast(6);        // value ko last me rakhna
			
			d.push(22);	        //  value ko rakhna
		    d.pop();          //  value ko nikalna
			d.peek();             // elements ko dekhna ki list me h ya nhi
		
			
			//d.offer(5);       // add a elements // offer // push
		
			System.out.println(d);	
			
			
				
				
	}
	
	
	
	
	
	
}
