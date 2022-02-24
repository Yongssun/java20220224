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
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("A");
		} else {
			System.out.println("점수가 90점 밑입니다");
			System.out.println("B");
		}
		
		
		System.out.println("--------------------------------------");
		
		
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
		
		
		System.out.println("--------------------------------------");
		
		
		int point = (int) (Math.random() * 20) + 75;
		System.out.println("점수:" + point);

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
			grade = "C 재수강 입니다";
		}

		System.out.println("학점:" + grade);
		
		
		System.out.println("--------------------------------------");
		
		
	}
}
