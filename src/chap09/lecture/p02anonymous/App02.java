package chap09.lecture.p02anonymous;

public class App02 {
	public static void main(String[] args) {
		class MyLocalClass1 implements MyInterface1{

			@Override
			public void method1() {
				System.out.println("로컬클래스에서 재정의");
				
			}
			MyInterface1 o1= new MyLocalClass1();
			o1.method1();
			 
		}
	}
}
