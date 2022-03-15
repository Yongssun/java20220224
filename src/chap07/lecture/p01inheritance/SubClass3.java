package chap07.lecture.p01inheritance;

public class SubClass3 extends SuperClass3{
	
	public SubClass3() {
		super("param");
		//기본생성자가 없으면 상위클래스에
		//파라미터있는 생성자를 명시적으로 호출해야함
		System.out.println("subclass3 no-args constructor");
	}
	public SubClass3(int i) {
	//super();
		super("p");
		System.out.println("subclass3 int-param constructor");
	}
}
