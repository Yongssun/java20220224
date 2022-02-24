package chap02.lecture;

public class C04Type {
	public static void main(String[] args) {
		
		double v1 = 3.14;
		//int v2= 3.14; x
		//데이터 타입(자료형)datatype
		//기본 데이터타입(primitive)
		//정수 0,1,3,
		//byte,short,int,long
		
		//실수
		//float,double
		
		//논리
		//boolean
		
		//문자
		//char
		
		//참조형(reference)위 8개 빼고 다
		//5챕터 설명
/////////////////////////////////////////
		//정수 (byte(1), short(2), int(4), long (8))
	//1byte=8bit
		int var2 = Integer.MAX_VALUE;
		System.out.println(var2);
		int var4 = Integer.MIN_VALUE;
		System.out.println(var4);
		
		
		short var6 = Short.MAX_VALUE;
		System.out.println(var6);
		short var7 = Short.MIN_VALUE;
		System.out.println(var7);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		long val10 = 9223372036854775807l;//if int< maxvalue  it change to int  so l(L) behind
		System.out.println(val10);
		// 큰 정수 사용시 _ 조합가능
		int val11=2_3812_2880;
		System.out.println(val11);
	}
}
