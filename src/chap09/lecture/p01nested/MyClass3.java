package chap09.lecture.p01nested;

public class MyClass3 {
	static class NestedClass1{
		
	}
	class NestedClass2{
		
		
	}
	void method1(){
		//MyClass3.NestedClass1 o1 = new MyClass.NestedClass1; 생략됨
		NestedClass1 o1 = new NestedClass1();
		NestedClass2 o2=  new NestedClass2();
	}
	static void method2() {
		NestedClass1 o1 = new NestedClass1();
		NestedClass2 o2=  new NestedClass2(); //xxx인스턴스 접근불가
	}
	NestedClass1 field1= new NestedClass1();
	NestedClass2 field2 = new NestedClass2();
	
	static NestedClass1 field3= new NestedClass1();
	static NestedClass2 field4= new NestedClass2();//xxx
}
