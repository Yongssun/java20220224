package chap01;

public class practice {
	public static void main(String[] args) {
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		int z = (int) (Math.random() * 5);
		int score = (x + y) * z;
		System.out.println("(" + x + "+" + y + ")" + "x" + z + "=" + score);
		
		
		System.out.println("--------------------------------------");
		
		
		int value = 10;
		int result = value + 10;
		System.out.println(result);
		
		
		System.out.println("--------------------------------------");
		
		
		int v1 = (int) (Math.random() * 20);
		int v2;
		if (v1 > 15) {
			v2 = v1 - 10;
		} else {
			v2 = v1 + 10;
		}
		int v3 = v1 + v2;
		
		System.out.println(v3);
		
		
		
		System.out.println("--------------------------------------");
		
		
		int score1 = 85;

		if (score1 >= 90) {
			System.out.println("������ 90���� Ů�ϴ�");
			System.out.println("����� a�Դϴ�");
		} else {
			System.out.println("������ 90���� �۽��ϴ�");
			System.out.println("����� b�Դϴ�");
		}
		
		
		System.out.println("--------------------------------------");
		
		
		int num = (int) (Math.random() * 6) + 1;

		if (num == 1) {
			System.out.println("1�� ���Խ��ϴ�.");
		} else if (num == 2) {
			System.out.println("2�� ���Խ��ϴ�.");
		} else if (num == 3) {
			System.out.println("3�� ���Խ��ϴ�.");
		} else if (num == 4) {
			System.out.println("4�� ���Խ��ϴ�.");
		} else if (num == 5) {
			System.out.println("5�� ���Խ��ϴ�.");
		} else {
			System.out.println("6�� ���Խ��ϴ�.");
		}
		
		
		System.out.println("--------------------------------------");
		
		
		int point = (int) (Math.random() * 20) + 75;
		System.out.println("����:" + point);

		String grade;

		if (point >= 95) {
			grade = "A+";

		} else if (point >= 90) {
			grade = "A";
		} else if (point >= 85) {
			grade = "B+";
		} else if (point >= 80) {
			grade = "B";
		} else {
			grade = "C ������Դϴ�";
		}

		System.out.println("����:" + grade);
		
		
		System.out.println("--------------------------------------");
		
		
	}
}
