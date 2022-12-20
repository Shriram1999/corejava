package in.com.collectionmethods;

import java.util.HashSet;

public class Set_Hashset2 {

	public static void main(String[] args) {
		
		
		HashSet h  = new  HashSet();
		h.add(123);
		h.add(23);
		h.add(5);
		h.add(100);
		h.add(89);
		h.add(8);                     // value ko double print nhi krta h  //
		h.add(89);
		h.add(89);                     // list me cheak kega ki value d  douplycate toh  nhi h
		h.add(8);
		
		
		
		
		
		//h.add("one");
		//h.remove(3);
		
		System.out.println(h);
	}

}
