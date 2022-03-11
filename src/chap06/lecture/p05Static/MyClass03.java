package chap06.lecture.p05Static;

public class MyClass03 {
	static {
		//static block
		//정적 초기화 블럭
		int sum=0;
		for(int i=0;i<10;i++) {
			sum+=i;
		}
		field2 =sum;
	}
	int field1;
	static int field2;
	MyClass03(){
		field1=10;
	}
}
