package in.com.collectionmethods;

import java.util.PriorityQueue;

public class Queue_PriorityQueue {

	public static void main(String[] args) {
	
		PriorityQueue p = new PriorityQueue<>();
		
		p.add(3.6);                    // jo value pass kroge wo sb me ek saman   pass krni hogi 
		p.add(2.3);                    // pehla int sb integer
		p.add(6.3);                     // pehla double sb double
        p.add(6.2);
        System.out.println(p);

	}

}
