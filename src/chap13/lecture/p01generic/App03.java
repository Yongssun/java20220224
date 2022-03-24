package chap13.lecture.p01generic;

public class App03 {
public static void main(String[] args) {
	Container3<String> con1= new Container3<String>();
	con1.setContent("java");
	String str1= con1.getContent();
	
	Container3<Integer> con2= new Container3<Integer>();
	con2.setContent(2);
	int i1=con2.getContent();
}
}
//<T> 타입 파라미터
//명명관습 대문자 하나 보통 T
//인스턴스 만들시 타입 파라미터에 작성한 타입으로 클래스 내부의
//타입이 결정됨
//타입 파라미터가 잇는 타입 = 제네릭 타입
class Container3<T>{
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
}
