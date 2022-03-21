package chap09.lecture.p01nested;

public class MyClass2 {
//static 멤버에서 instance 멤버에 접근할수없다
	//static 중첩
	static class NestedClass1{
		//필드
		int field1;
		static int field2;
		//메소드
		void method1() {
			
		}
		static void method2() {
			
		}		
	}
	//instance 중첩클래스
	class NestedClass2{
		//필드
		int field1;
		//static field2;  static 필드 가질수 없음
		static final int FIELD3=3;//static final가능
		//메소드
		void method1() {
			
		}
	}
}
