package chap06.lecture.p06final;

public class App03 {
	static int i=3;
	static final int j=5;
	static final int k;
	final static int l;
	static final double PI=3.14;
	//static final 변수명은 항상 대문자 단어사이는 _로 구분
	static final int STUDENT_NUMBER =30;
	static {
	l=30;
		k=99;
	}
	public static void main(String[] args) {
		i=4;
//		j=6;
//		k=100;
	}
}
