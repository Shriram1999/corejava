package StrimAPI;

import java.util.Arrays;
import java.util.List;

public class TestStrim {

	
	public static void main(String[] args) {
		
		
	List<Integer>list=	Arrays.asList (1,2,2,3,4,5,6,6,7,8,8,9);
		
		list.stream(). distinct().skip(5).filter(e->e==2  ).forEach(l->System.out.println(l));
		
		
	}
	  
	
}
