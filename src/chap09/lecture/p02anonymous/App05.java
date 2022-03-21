package chap09.lecture.p02anonymous;

public class App05 {
public static void main(String[] args) {
	MyAbstracClass1 o1 = new MyAbstracClass1() {

		@Override
		public void method1() {
		System.out.println("퍼브릭");
			
		}

		@Override
		public void method2() {
			System.out.println("프로텍티드");
			
		}
		@Override
		public void method3() {
			System.out.println("패키지 프라이빗");
		}
		
	};
	
}
}
