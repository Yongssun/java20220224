package chap09.lecture.p01nested;

public class MyClass7 {
void method1() {
	//local 클래스에서 local(지역)변수 사용시 주의할점
	//지역변수는 finial이어야함
	//단 값이 변경되지 않으면 생략가능(effectively final)
	final int i=3;
	class LocalClass1{
		void method2() {
			System.out.println(i);
		}
		void method3(int param) {
			System.out.println(param);
			param = 4;
		
		}
	}
//	i= 4; final 안붙일시 오류남
}
}
