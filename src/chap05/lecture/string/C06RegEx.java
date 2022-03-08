package chap05.lecture.string;

public class C06RegEx {
	public static void main(String[] args) {
		//regular expression
		//정규식 (정규표현식)
		//문자열의 패턴을 표현한 문자
		//git.io/vx86V
		//한 문자
		System.out.println("a".matches("a"));
		System.out.println("b".matches("a"));
		System.out.println("aa".matches("a"));
		System.out.println("abc".matches("a"));
		//여러 문자중 하나
		System.out.println("a".matches("[abc]"));
		System.out.println("b".matches("[abc]"));
		System.out.println("c".matches("[abc]"));
		System.out.println("d".matches("[abc]"));
		System.out.println("abc".matches("[abc][abc][abc]"));
		System.out.println("bbb".matches("[abc][abc][abc]"));
		//예제1
		//전화번호 : 010-9999-9999
//		String pattern1= "010-\\d{4}-\\d{4}";
		String pattern1= "010-\\d{3,4}-\\d{4}";
		System.out.println("010-9232-2111".matches(pattern1));
		System.out.println("010-2321-1241".matches(pattern1));
		System.out.println("010-925-2131".matches(pattern1));
		//
		String pattern2="[h,d]";
		System.out.println("h".matches(pattern2));
		System.out.println(",".matches(pattern2));
		System.out.println("d".matches(pattern2));
		System.out.println("1s34".matches("\\d+"));
	}
}
