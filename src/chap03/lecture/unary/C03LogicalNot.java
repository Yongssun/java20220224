package chap03.lecture.unary;

public class C03LogicalNot {
	public static void main(String[] args) {
		//논리연산자  not
		//!
		
		boolean b1 =true;
		boolean b2 =false;
		
		System.out.println(!b1);
		System.out.println(!b2);
		
		boolean b3 =!b1;
		System.out.println(b3);
		
		b3 = !b2;
		System.out.println(b3);
		
	}
}
