package chap06.lecture.p10singleton;

public class App01 {
	public static void main(String[] args) {
		Manager m1= Manager.getInstance();
		Manager m2= Manager.getInstance();
		System.out.println(m1);
		System.out.println(m2);
	}
	
	
}
