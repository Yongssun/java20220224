package chpa04.lecture.forloop;

public class C06Array {
	public static void main(String[] args) {
		//여러개값을 가진 자료구조
		//특징: 순서가 잇음
		int i1 = 3;
		int[] arr1= {10,20,30}; //int 배열 타입 arr1에 여러개의 int 타입

	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	System.out.println(arr1[2]);
	
	arr1[0]=100;
	arr1[1]=300;
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	System.out.println(arr1[2]);
	
	//배열의 길이
	System.out.println(arr1.length);
	}
}
