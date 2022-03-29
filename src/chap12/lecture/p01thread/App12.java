package chap12.lecture.p01thread;

public class App12 {
public static void main(String[] args) {
	Thread t1 = new Thread(new Runnable() {
		@Override
		public void run() {
			System.out.println("쓰레드 1실행");
		}
	});
}
}
