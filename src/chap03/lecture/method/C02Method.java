package chap03.lecture.method;

public class C02Method {
	public static void main(String[] args) {
		
		System.out.println("명령문1");
		myMethod1(300);
		System.out.println("명령문2");
		myMethod1(3);
		System.out.println("명령문3");
		
	}
	//메소드 명:lowerCamelCase
	//()받을 수 있는 타입과 이름 작성 가능(값)->파라미터
	public static void myMethod1(int i) {
		System.out.println("마이 메소드1");
		System.out.println("파라미터 i 의 값:" + i);
	}
}
