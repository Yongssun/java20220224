package chap10.lecture.p02try_Catch;

public class App04 {
public static void main(String[] args) {
	int[] arr1=new int[] {3,0};
	
	try {
		int r=arr1[0]/arr1[1]; 
	System.out.println(r);}
	catch(ArithmeticException e) {
		System.out.println("아리스메틱");
	}catch(NullPointerException e) {
		System.out.println("널포");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("어레이");
	}
}
}
