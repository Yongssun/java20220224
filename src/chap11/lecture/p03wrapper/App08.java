package chap11.lecture.p03wrapper;

public class App08 {
public static void main(String[] args) {
	Integer i1= new Integer(9999);
	Integer i2= new Integer(9999);
	int i3 = 9999;
	
	System.out.println(i1 ==i2);
	System.out.println(i1==i3);//기본타입과 비교시 자동 언박싱
	
	Integer i4 = new Integer(9999);
	Integer i5 = new Integer(8888);
	
	System.out.println(i5<i4);//비교시 자동 언박싱
	//비교 메소드
	//compareTo()
	//결과 int
	//0 : 같으면
	//음수: 이 객체가 작으면
	//양수: 이 객체 가 크면
	i4.compareTo(i5);
	System.out.println(i4.compareTo(i5));
}
}
