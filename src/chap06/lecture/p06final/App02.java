package chap06.lecture.p06final;

public class App02 {
	static int l=30;
	int i = 3;
final int j=5;
final int k;
App02(){
	k=30;
}
	public static void main(String[] args) {
		App02 i1=new App02();
		System.out.println(i1.i);
		i1.i =4;
//		i1.j =7; //xxx
//		i1.k =2; //xxx
		System.out.println(i1.i);
	}
}
