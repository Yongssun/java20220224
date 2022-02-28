package chap03.lecture.method;

public class C04Method {
	public static void main(String[] args) {
		myMethod1(3, 5);
		myMethod1(33,55);
		myMethod1('가',33);
		
		myMethod2(999, 888);
		myMethod3(4,true, 11341, 3.14);
	}
	public static void myMethod1(int i , int j) {
		System.out.println(i);
		System.out.println(j);
	}
	public static void myMethod2(int age , int height) {
		System.out.println(age * 2);
		System.out.println(height * 2 );
		
	}
	
	public static void myMethod3(int i, boolean b, long l, double d) {
		System.out.println(i);
		System.out.println(b);
		System.out.println(l);
		System.out.println(d);
	}
}
