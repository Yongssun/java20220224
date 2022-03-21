package chap10.lecture.p02try_Catch;

public class App01 {
	public static void main(String[] args) {
		String s = "java";
		String t = null;
		System.out.println(s.length());
		System.out.println("트라이 블럭 실행");
		try {
			System.out.println(t.length());
		} catch (NullPointerException e) {
			System.out.println("프로그램 실행계속");
		}
	}
}
