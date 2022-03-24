package chap13.lecture.p01generic;

import java.util.ArrayList;

import chap08.lecture.p01interface.example_class.*;

public class App11 {
public static void main(String[] args) {
	ArrayList<Pet> list1= new ArrayList<>();
	ArrayList<Canine> list2= new ArrayList<>();
	ArrayList<Cat> list3= new ArrayList<>();
}
// 값을 넣은 떄  extends
// 값을 구현할때 super
// 오브젝트를 넣을때 ?
// 넣고 뺄때  ?쓰지 않기
public static void method(ArrayList<?> list) {
	;
	;
}
}

