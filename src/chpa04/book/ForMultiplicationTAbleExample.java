package chpa04.book;

public class ForMultiplicationTAbleExample {
	public static void main(String[] args) {
		for(int m =2; m<=9;m++) {
			System.out.println("***"+m+"단***");
			for(int n=1;n<=9;n++) {
	System.out.println(m+"x"+n+"="+(m*n));			
			}
		}
		for(int m =9; m>=2;m--) {
			System.out.println("***"+m+"단***");
			for(int n=1;n<=9;n++) {
	System.out.println(m+"x"+n+"="+(m*n));			
			}
		}
		for(int m =9; m>=2;m--) {
			System.out.println("***"+m+"단***");
			for(int n=9;n>=1;n--) {
	System.out.println(m+"x"+n+"="+(m*n));			
			}
		}
	}
}
