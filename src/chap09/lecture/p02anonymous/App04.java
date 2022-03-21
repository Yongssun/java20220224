package chap09.lecture.p02anonymous;

public class App04 {
	public static void main(String[] args) {
		
	
	MyInterface2 o1= new MyInterface2() {

		@Override
		public void method1() {
			System.out.println("재정의");
		}

		@Override
		public void method2() {
			System.out.println("재정의2");
			
		}
	};
	o1.method1();
	o1.method2();
		
	
}
}