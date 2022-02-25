package chap03.book;

public class B10AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number= 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result+"조각이 남는다");
		
		
	
		int apple1 = 1;
		
		int totalpiece = apple * 10;
		int number1= 7;
		
		int temp = totalpiece - number;
		
		double result1 = temp/10.0;
		
		System.out.println("사과한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result1+"조각이 남는다");
		
		
	}
}
