package chap05.lecture.enum_type;

public class App04 {
public static void main(String[] args) {
	Season s1=Season.SPRING;
	s1.ordinal();
	System.out.println(s1.ordinal());
	
	//name method
	//tostring
	String str = s1.toString();
	System.out.println(str);
	
	
}
}
