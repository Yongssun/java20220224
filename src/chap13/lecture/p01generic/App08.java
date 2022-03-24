package chap13.lecture.p01generic;

import java.util.ArrayList;
import java.util.List;

public class App08 {
public static void main(String[] args) {
	ArrayList<String> list1= new ArrayList<>();
	list1.add("java");
	list1.add("spring");
	
	String e1= list1.get(0);
	String e2= list1.get(1);
	
	System.out.println(e1);
	System.out.println(e2);
	
	List<String> list2=list1;//arraylist<stirng>은list<string>의 하위 타입
	ArrayList<Object> list3=list1;//안에 잇는 스트링은 오브젝의 하위 타입이지만 어레이 리스틑는 관련 없음
}
}
