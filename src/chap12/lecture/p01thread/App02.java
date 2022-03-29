package chap12.lecture.p01thread;

public class App02 {
public static void main(String[] args) {
	Thread t1=  new MyThread1();
	
	t1.start();
	for(int i=0; i<10000;i++) {
	System.out.println("메인쓰레드실행");
	}
}
}

class MyThread1 extends Thread {
	@Override
	public void run() {
			for(int i=0; i<10000;i++) {
			System.out.println("thread1 실행중");
		}
	}
}