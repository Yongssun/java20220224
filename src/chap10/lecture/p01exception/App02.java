package chap10.lecture.p01exception;

public class App02 {
public static void main(String[] args) {
	//ArrayIndexOUtOfBoundsException
	
	int[] arr1= new int[] {5,6,7};
	System.out.println(arr1[0]);
	System.out.println(arr1[2]);
	
	System.out.println(arr1[3]);
}
}
