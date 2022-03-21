package chap10.lecture.p02try_Catch;

public class App03 {
public static void main(String[] args) {
	int i=3;
	int j=0;
	try {
		int k=i/j;//exception
		System.out.println("몫:"+k);
	}catch(ArithmeticException e) {
		System.out.println("잘못된 연산");
	}
}
}
