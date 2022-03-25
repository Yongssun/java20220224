package chap14.lecture.p01lamda;

public class App03 {
public static void main(String[] args) {
	MyInterface3 o1= new MyInterface3() {

		@Override
		public void method1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void method2() {
			// TODO Auto-generated method stub
			
		}
		
	};
	MyInterface3 o2=()->{
		//
	};
}
}
interface MyInterface3 {
	void method1();
	void method2();
}