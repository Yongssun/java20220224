package chpa04.lecture.switchcase;

public class C03Switch {
	public static void main(String[] args) {
		//일치 하는게 없을 경우 default;
		switch (3) {
		case 1:
			System.out.println("stmt 1");
			break;
			
		case 2:
			System.out.println("stmt 2");
			break;
			
			
		default:
			System.out.println("stmt 3");
			break;
		}
	}
}
