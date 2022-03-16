package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymophism_class.Animal;
import chap07.lecture.p99polymophism_class.Canine;
import chap07.lecture.p99polymophism_class.Chihuahua;
import chap07.lecture.p99polymophism_class.StreetCat;

public class App02 {
public static void main(String[] args) {
	Animal animal1 = new Chihuahua();
	Animal animal2 = new StreetCat();
	
	animal1.breathe();
	animal2.breathe();
	
	animal1.cry();//실제 인스턴스의 메소드가 실행
	animal2.cry();
	
	Animal animal3 = new Canine();
	animal3.cry();
}
}
