package chap07.lecture.p02override;

public class SubClass2 extends SuperClass2{
	@Override
	public void method1() {
		//super:상위 클래스 멤버에게 접근
		super.method1();
		System.out.println("서브 클래스2 메소드1");
}
}
