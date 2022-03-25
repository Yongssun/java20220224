package chap14.lecture.p01lamda;

public class App05 {
public static void main(String[] args) {
	MyInterface5 o1 = (int a, int b) ->{
		return a+b;
	};
	MyInterface5 o2= (d,e)->{
		return d*e;
	};
	//명령문 하나일때 중괄호 생략
	//그 명령문이 return 명명문일때 return 키워드 생략
	
	MyInterface5 o3 = (x,y)-> x - y;
	MyInterface51 o4= (x)-> System.out.println(x);
	//파라미터 하나일때 둥근괄호 생략
	MyInterface51 o5= x-> System.out.println(x);
	System.out.println(o2.method(2, 23));
	System.out.println(o1.method(5,4));
	System.out.println(o3.method(20, 10));
	o4.method(2);
	o5.method(6);
}
}

@FunctionalInterface
interface MyInterface5{
	int method(int x, int y);
}
@FunctionalInterface
interface MyInterface51{
	void method(int x);
}
