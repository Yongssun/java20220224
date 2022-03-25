package chap14.lecture.p01lamda;

public class App02 {
	public static void main(String[] args) {
		//	MyInterface2 o1= new MyInterface2() {
		//
		//		@Override
		//		public void method1(int c, int e) {
		//			System.out.println(e);
		// 			System.out.println(c);
		//		}	
		//		};
		MyInterface2 o1 = (int c, int e) -> {
			System.out.println(c);
			System.out.println(e);
		};
//추상메소드만 하나 있을때 쓸 수 잇음
	}
}

interface MyInterface2 {
	void method1(int a, int b);
}