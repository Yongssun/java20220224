package chap06.lecture.p08access.package1;

public class App01 {
public static void main(String[] args) {
	Computer com1 = new Computer();
	com1.str1 = "java";
//	com1.str2= "a";//private 필드여서 접근 불가
	//com1.str3 ="v";//package private 필드여서 접근불가
	System.out.println(com1.str1);
	
	//access modifier:접근 제한자 ,접근 지정자
	//class ㅡ생성자 ,필드,메소드의 접근 권한을 결정해주는 키워드
	//public,protected,default(package private),private
	//public:모두 접근 가능
	//protected: 다른 패키지에 있지만 상속받은 클래스내에서 접근가능
	//default:같은 패키지 내에서만 사용가능
	//private:같은 클래스 내에서만 사용가능
}
}
