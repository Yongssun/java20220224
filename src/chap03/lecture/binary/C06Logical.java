package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		//논리연산자
		//&&:and(short circuit'단선'),||:or(short circuit'단선'),
		//&:and,|:or,^:xor
		//피연산자 : boolean
		//연산결과 : boolean
		//&& // 양변모두 트루일때만 true
		System.out.println(true && true);
		
		//||
		//양변 모두 false 일때만 false 한쪽이라도 true면 true
		System.out.println(true || false);
		System.out.println(true || true);
		
		//short circuit//앞쪽에 값으로 true인지  false인지 판단할때 
		//이미 값이 나온다면 뒤쪽 값은 연산하지 않음
		int i =3;
		System.out.println((i>0)&&(i++>0));
		System.out.println(i);
		System.out.println((i<0)&&(i++<0));
		System.out.println(i);
		
		//& | ^ 뒤 값까지 연산
		System.out.println((i<0)&(i++<0));
		System.out.println(i);
		//^ 양변이 다른 떄만  true
		System.out.println(true^true);
		System.out.println(false^true);
	}
}
