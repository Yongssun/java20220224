package chap13.lecture.p01generic;

public class App07 {

}
interface MyInterface7<T>{
	public void method(T param);
	
}
//제네릭 탑 상속또는 구현시 하위 클래스도 제네릭 타입이어야함
class MyClass1<T> implements MyInterface7<T>{
	@Override 
	public void method(T param) {
		
	}
}
//하위 클래스에 타입파라미터 추가 가능
class MyClass2<T,U> implements MyInterface7<T>{
	private U field;
	@Override 
	public void method(T param) {
		
	}
}