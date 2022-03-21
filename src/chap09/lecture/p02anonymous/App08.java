package chap09.lecture.p02anonymous;

public class App08 {
	public static void main(String[] args) {
		//o1.method1();
		otherMethod(new MyInterface1() {

			@Override
			public void method1() {
				System.out.println("마이인터페이스 메소드 1 재정의");

			}

		});
		MyInterface1 o2=new MyInterface1() {

			@Override
			public void method1() {
				System.out.println("마이인터 재정의");
				
			}
			
		};
		otherMethod(o2);
		
		otherMethod2(new int[] { 3, 4 });
	}

	private static void otherMethod2(int[] arr) {
		// TODO Auto-generated method stub

	}

	public static void otherMethod(MyInterface1 param) {
		param.method1();

	}
}
