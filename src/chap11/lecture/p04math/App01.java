package chap11.lecture.p04math;

public class App01 {
public static void main(String[] args) {
	//반올림
	System.out.println("반올림 3.14");
	long l1= Math.round(3.14);
	System.out.println(l1);
	//올림
	System.out.println("올림 3.14");
	double d1= Math.ceil(3.14);
	System.out.println(d1);
	
	//내림
	System.out.println("내림 3.14");
	double d2= Math.floor(3.14);
	System.out.println(d2);
	
	//절대값
	System.out.println("절대값 -5");
	int i1=Math.abs(-5);
	System.out.println(i1);
	//비교 max
	System.out.println("비교 max3,10");
	int i2= Math.max(3, 10);
	System.out.println(i2);
	
	System.out.println("비교min 3,10");
	int i3= Math.min(3, 10);
	System.out.println(i3);
	
	System.out.println("임의의 값 랜덤"+Math.random());
}
}
