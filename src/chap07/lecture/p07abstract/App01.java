package chap07.lecture.p07abstract;

public class App01 {
public static void main(String[] args) {
	Canine c1= new Chihuahua();
	Canine c2 = new JindoDog();
	c2.play();
	c1.play();
	//Canine c3= new Canine();//추상 클래스로 인스턴스 만들수 없음
	method(c1);
	method(c2);
}
public static void method(Canine dog) {
	dog.play();
	dog.bark();
}
}
