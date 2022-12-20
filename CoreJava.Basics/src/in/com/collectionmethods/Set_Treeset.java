package in.com.collectionmethods;

import java.util.Set;
import java.util.TreeSet;

public class Set_Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s = new TreeSet();
		
		s.add(123);
		s.add(23);
		s.add(5);
		s.add(2);
		s.add(89);
		s.add(8);           
		s.add(1);                        //  value ko assinding order me rakhta he //
		s.add(89);                         //  mtlb squane me list bnata h   1,2,3,4,5,6,7,8,9                   
		s.add(8);
		
		System.out.println(s);
		
		
	}

}
