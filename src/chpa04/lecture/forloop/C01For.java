package chpa04.lecture.forloop;

public class C01For {
	public static void main(String[] args) {
		System.out.println("stmt 1");

		
		//for()안에1 ;2;4  3개의 명령문
		// 1: 초기값 2: 조건 4: 증감 // 코드블럭
		//실행순서 1>2>3>4
		for(int i=0; i<3;i++ ){
			System.out.println("stmt 2");
			System.out.println("stmt 3");
		}

		System.out.println("stmt 4");
	}
}
