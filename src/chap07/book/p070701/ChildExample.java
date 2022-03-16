package chap07.book.p070701;

public class ChildExample {
public static void main(String[] args) {
	Child child = new Child();
	Parent parent = child;
	parent.method1();
	parent.method2();
	//호출 불가
	//parent.method3();
	child.method3();

}
}
