package chap12.lecture.p01thread;

public class App13 {
public static void main(String[] args) {
	Thread t1= new Thread(() -> System.out.println("쓰레드 1실행"));
	Thread t2= new Thread(() -> System.out.println("쓰레드 2실행"));
	t1.start();
	t2.start();
}
}