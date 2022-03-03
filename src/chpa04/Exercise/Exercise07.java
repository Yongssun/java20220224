package chpa04.Exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>");
			int cho = scanner.nextInt();
			int money = 0;
			switch (cho) {
			case 1:
				money += scanner.nextInt();
				System.out.println("예금액>" + money);
				break;
			case 2:
				money -= scanner.nextInt();

				System.out.println("출금액>" + money);
				break;
			case 3:
				System.out.println("잔고>" + money);
				break;
			case 4:
				System.out.println();
				run=false;
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}
