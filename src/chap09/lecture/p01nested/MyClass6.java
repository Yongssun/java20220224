package chap09.lecture.p01nested;

public class MyClass6 {
	int outField1;
	void outMethod1() {
		
	}
	void method1() {
		class LocalClass {
			int outField1; 
			
			void method1() {
				outField1 =3;
				MyClass6.this.outField1= 5;//클래스 밖 인스턴스 접근
				outMethod1();
			}
		}
	}
}
