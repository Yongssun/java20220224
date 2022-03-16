package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymophism_class.Animal;
import chap07.lecture.p99polymophism_class.Chihuahua;
import chap07.lecture.p99polymophism_class.StreetCat;

public class App09 {
	public static void main(String[] args) {
		Animal animal=new StreetCat();
		animal.breathe();
		animal.cry();
		
		//angry 메소드 실행을 위해
		Chihuahua chihuahua = (Chihuahua)animal;//ClassCastException 발생 (프로그램 종료)
		chihuahua.angry();
		System.out.println("명령문 진행 계속-----------------");
	}		
}
