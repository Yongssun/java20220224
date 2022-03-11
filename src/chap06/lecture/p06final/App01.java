package chap06.lecture.p06final;

public class App01 {
	
	public static void main(String[] args) {
		int i=0;
		i=3;
		//final 은 값을 한번만 할당 가능
		final int j=0;
			
		final int k;
		k= 9;
		method1(3);
		method1(10);
	}
	public static void method1(final int i) {
//		i =30; xxx
	}
}
