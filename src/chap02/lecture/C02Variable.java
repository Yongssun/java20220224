package chap02.lecture;

public class C02Variable {
	public static void main(String[] args) {
		//변수의 사용범위: 선언된 블럭 {}안에서 만 사용 가능
		
		boolean b = true;
		if(b) {
			int a=3;
			System.out.println(a);
		}
//		System.out.println(a);  if 블럭 밖 a 사용 불가
	}
}
