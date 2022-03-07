package chap05.lecture.array;

import java.util.Arrays;

public class C12Arrays {
	public static void main(String[] args) {
		int[] a= {-1, 9, 2, 3, 10};
		System.out.println(a);
		System.out.println(Arrays.toString(a));//내용 string 값으로 출력
		Arrays.sort(a);//정렬 명령어
		System.out.println(Arrays.toString(a));
		int[] b= new int[10];
		Arrays.fill(b, 5);
		System.out.println(Arrays.toString(b));
	}
}
