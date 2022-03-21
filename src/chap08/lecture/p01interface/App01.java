package chap08.lecture.p01interface;

public class App01 {
public static void main(String[] args) {
	System.out.println(Myinterface2.FIELD1);
	System.out.println(Myinterface2.FIELD2);
	
	Myinterface2.FIELD1 =33; //xxxxfinal 값변경 불가
}
}
