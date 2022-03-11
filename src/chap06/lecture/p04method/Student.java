package chap06.lecture.p04method;

public class Student {
	String name;
	Student(String name){
		this.name = name;
	}
	//instance method 기능
	//작성방법  
	//리턴 타입 메소드명 (파라미터 타입 파라미터명..){명령문}
	void study() {
		//실행할 명령문..
		System.out.println(name+"이(가)");
		System.out.println("공부합니다");
	}
}
