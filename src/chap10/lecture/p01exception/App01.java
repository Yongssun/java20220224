package chap10.lecture.p01exception;

public class App01 {
public static void main(String[] args) {
	//NullPointerException
	String s= "java";
	System.out.println(s.length());
	
	String t=null;
	System.out.println(t.length());
}
}
