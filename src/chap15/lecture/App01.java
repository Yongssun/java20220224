package chap15.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App01 {
public static void main(String[] args) {
	//list:순서가 있고, 중복 저장 가능
	//대표적인 구현 클래스 : ArrayList
	ArrayList<Integer> list1 = new ArrayList<>();
	list1.add(1);
	list1.add(2);
	list1.add(3);
	
	int i1=list1.get(0);
	int i2=list1.get(1);
	int i3=list1.get(2);
	
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(i3);
	int[] arr=new int[3];
	
	System.out.println(list1.toString());
	System.out.println(Arrays.toString(arr));
	
	//길이 리턴
	
	int length = list1.size();
	
	//for loop 로 탐색
	
	for(int i=0;i<list1.size();i++) {
		System.out.println(list1.get(i));
	}
	//향상된 for 문
	for(int num: list1) {
		System.out.println(num);
	}
	
}
}

