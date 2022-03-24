package chap13.lecture.p01generic;

import chap07.lecture.p99polymophism_class.Animal;
import chap07.lecture.p99polymophism_class.Chihuahua;

public class App04 {
public static void main(String[] args) {
	Container4<String> o1 = new Container4<String>();
	Container4<Integer> o2 = new Container4<Integer>();
	Container4<Animal> o3 = new Container4<Animal>();
	
	//Container4<int>o4= new Container5<int>();
	//기본타입은 타입파라미터 사용 불가
	//박싱 사용해야함
	Container4<Chihuahua> o4=new Container4<>();//버전에 따라 생략가능
}
}
class Container4<T>{
	public void method(T param) {
		
	}
}
