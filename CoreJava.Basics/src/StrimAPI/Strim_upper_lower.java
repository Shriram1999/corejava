package StrimAPI;

import java.util.Arrays;
import java.util.List;

public class Strim_upper_lower {

	public static void main(String[] args) {
		
           List<String>list=	Arrays.asList ("java","rays","PYTHAN","dotnet");
		
	     	list.stream().map(e->e.toLowerCase()).forEach(l->System.out.println(l));
		
		
		
		
		
		
		
		

	}

}
