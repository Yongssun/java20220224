package chap03.lecture.binary;

public class C03Arithmetic {
	public static void main(String[] args) {
		double n1 = 0.1;
		double n2 = 0.2;
		
		double n3 = n1+n2;
		System.out.println(n3);
		
		//실수 무한대 infinity
		double n4 = 3.14;
		double n5= 0.0;
		double n6 = n4/ n5;
		System.out.println(n6);//0으로 나누면 무한
		
		double n7=n4 % n5;//not a number(NaN)
		System.out.println(n7);
		//정수 0으로 나눔 -> x infinity  o exception
		
		int n8 = 3;
		int n9 = 0;
		
		int n10 = n8 / n9;// exception 발생 후 프로그램 종료
		System.out.println("실행이어짐");
	}
}
