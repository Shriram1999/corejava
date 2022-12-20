package in.com.collectionmethods;

import java.util.Stack;

public class ListStacktest1 {

	public static void main(String[] args) {
		
       Stack s = new Stack();
       
       
       s.push(1);                           // rakhna elements ko  > push  //
       s.push(2);
       s.push(3);
       s.push(4);
     
       
       s.pop();                             // nikalna elements ko  > pop  //
       s.pop() ;                             //jitni  bhi val ue nikalna ho utni bar pop ka use krna padega  //
      
      
       
       s.peek();       						// elements ko acces karta he > peek //                          
       
       System.out.println(s);
	}

}
