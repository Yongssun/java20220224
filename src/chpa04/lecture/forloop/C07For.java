package chpa04.lecture.forloop;

public class C07For {
	public static void main(String[] args) {
		int[] arr1= {3,9,7,1,2,0};
		
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[5]);
		
		for(int i= 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for(int i= 0; i < arr1.length; i++) {
		
			System.out.println(arr1[i]*2);
		}
		
	}
}
