package chpa04.lecture.string;

public class C01string {
	public static void main(String[] args) {
		String str1="java";
		
		String sub1= str1.substring(0, 2);
		System.out.println(sub1);
		System.out.println(str1.substring(2,4));
		System.out.println(str1.substring(2));
		
		System.out.println(str1.length());
	}
}
