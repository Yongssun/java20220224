package chap09.lecture.p02anonymous;

public class App03 {
	public static void main(String[] args) {
	//지역클래스만드는 과정생략
		//즉,클래스가없음 (anonymous 무명 클래스
		
		//인터페이스 구현과 인스턴스생성을 한번에 작성
		MyInterface1 o1= new MyInterface1() {
			//구현클래스 작성
			@Override
			public void method1() {
				System.out.println("무명클래스에서 재정의");
				
			}
		};
		o1.method1();
	}
}
