package in.com.Asigment;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr =new int [] {1,1,2,3,3,4,5,5,6,7,7,8,9,9};
		
		System.out.println("Duplicate elements in given array:");
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=arr[i]) {
				System.out.println(i);
			}
			for (int j = i; j < arr.length; j++) {
				
				if (arr[i]==arr[j]) {
				System.out.println(arr[j]);	
				}
			}
		}
		
		
		
		
	}

}
