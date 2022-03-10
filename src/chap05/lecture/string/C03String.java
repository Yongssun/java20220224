package chap05.lecture.string;

public class C03String {
	public static void main(String[] args) {
		String s1="spring";
		String s2="java";
		String s3="우크라이나";
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		//charAt(int):파라미터로 받은 인덱스의 문자 chat 리턴
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(0));
		System.out.println(s3.charAt(0));
		
		System.out.println(s1.charAt(s1.length()-1));
		System.out.println(s2.charAt(s2.length()-1));
		System.out.println(s3.charAt(s3.length()-1));
		
		String s4="spr";
		String s5="ing";
		String s6= s4+s5;
		System.out.println(s1);
		System.out.println(s6);
		System.out.println(s1.equals(s6));
		
		//indexOf(string): 파라미터로 받은 문자열이 처음 발경된 위치를 리턴
		String s7= "이 책을 통해 무엇을 배울 수 있죠";
		System.out.println(s7.indexOf("책을"));
		System.out.println(s7.indexOf("무"));
		System.out.println(s7.indexOf("배울"));
		//substring(int,int) 문자열의 부분 문자열을 리턴
		System.out.println(s7.substring(8, 11));
		System.out.println(s7.substring(12,16));
		
		//substring(int) 문자열의 시작부터 리턴
		System.out.println(s7.substring(8));
	}
}