package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymophism_class.Animal;
import chap07.lecture.p99polymophism_class.Chihuahua;

public class App08 {
	public static void main(String[] args) {
		Animal animal=new Chihuahua();
		animal.breathe();
		animal.cry();
		
		//angry 메소드 실행을 위해
		Chihuahua chihuahua = (Chihuahua)animal;//강제형변환
		chihuahua.angry();
		
	}
}
