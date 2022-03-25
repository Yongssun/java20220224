package chap14.lecture.p01lamda;

public class App06 {
	public static void main(String[] args) {
		
	
 int local =0; //final or effectively final
 MyInterface6 o1=()->System.out.println(local);
}
}
@FunctionalInterface
interface MyInterface6{
	void method1();
}