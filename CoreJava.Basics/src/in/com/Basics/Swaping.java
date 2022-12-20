package in.com.Basics;

public class Swaping {

	public static void main(String[] args) {
		
		int x =25;
		int y =10;
		int z =15;
		
//# way 1

		//x=y;
		//y=z;
		//z=x;
		//System.out.println(y);
		//System.out.println(z);
		//System.out.println(x);
		
//  # way 2
		
		//x=x+y;
		//y=x-y;
		//x=x-y;
		//System.out.println(x);
		//System.out.println(y);
		//System.out.println(x);
		
//way   #  3
		
            //x=x*y;		
		    //y=x/y;
		    //x=x/y;
		
		//System.out.println(x);
		//System.out.println(y);
		//System.out.println(x);
		
// way   # 4
		
		//x=x^y;
		//y=x^y;
		//x=x^y;
		//System.out.println(x);
		//System.out.println(y);
		//System.out.println(x);
		
// way	# 5	
		
		x=y-x+(y=x);
		System.out.println(x);
		
		
		
	}

}
