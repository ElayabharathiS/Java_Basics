package Test_package;

public class D4_enhanced_for_loop {

	public static void main(String[] args) {
		String[] arr = {"Hi", "Hello There", "this is Elaya" };
		
		for(String s : arr) {
			System.out.println(s);
		}
		
        
		
		int[] arr1 = {1,2,3,4,5,6,8,9,12,13,15,26,78,};
		
		for(int i=0; i<arr1.length; i++) {
			if (arr1[i] %2 == 0)
			{
			System.out.println(arr1[i]);
			break;
			}
			else 
				System.out.println(arr1[i] +" is not mutiple of 2");
		}
		
	}

}
