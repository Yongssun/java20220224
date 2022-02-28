package chpa04.book;

public class B04IfDiceExample {
public static void main(String[] args) {
	int num = (int) (Math.random() * 6) + 1;

	if (num == 1) {
		System.out.println("\"1\"이 나왔습니다");
	} else if (num == 2) {
		System.out.println("\"2\"가 나왔습니다.");
	} else if (num == 3) {
		System.out.println("\"3\"이 나왔습니다.");
	} else if (num == 4) {
		System.out.println("\"4\"가 나왔습니다.");
	} else if (num == 5) {
		System.out.println("\"5\"가 나왔습니다.");
	} else {
		System.out.println("\"6\"이 나왔습니다.");
	}
}
}
