package in.com.collectionmethods;

import java.awt.Container;
import java.util.HashMap;
import java.util.Map;

public class map_Hashmap {
 
	public static void main(String[] args) {
		
		Map m =new HashMap();
		
		m.put(1, "java");
		m.put(2,"c");
		m.put(3, "c++");
		m.put(4, "pythan");
		
	//	m.remove(4);                        // value ko reemove krna
	
		System.out.println(m);
		
	}
}
