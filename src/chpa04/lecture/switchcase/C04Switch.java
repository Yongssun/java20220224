package chpa04.lecture.switchcase;

public class C04Switch {
	public static void main(String[] args) {
		int i=3;
		
		switch (i) {
		case 1:
			System.out.println("stmt 1");
			break;

		default:
			System.out.println("stmt 2");
			break;
		}
		
		String s = "hello";
		
		switch (s) {
		case "hello":
			System.out.println("stmt3");
			break;

		default:
			System.out.println("stmt4");
			break;
		}
	}
}
