package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;



public class App07 {
public static void main(String[] args) {
	//arraylist 0~99까지 인티저 엘레멘트 추가
	List<Integer> list1= new ArrayList<>();
	for(int i=0; i<100;i++) {
		list1.add(i);
	}
	System.out.println(list1);
}
}
