package chap05.exercise;
import java.util.Scanner;
public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum=0;
		int[] scores = null;
		
		Scanner scanner= new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				
				String str1=scanner.nextLine();
				System.out.println(str1);
				System.out.print("학생수>");
				scores=new int[Integer.valueOf(str1)];
				System.out.println(scores.length);
				
				
			}
		}
		
		
		
		System.out.println("프로그램 종료");
		scanner.close();
		
		
	}
}
