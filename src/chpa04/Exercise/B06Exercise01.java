package chpa04.Exercise;

public class B06Exercise01 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j= 0;j<(i+1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=5; i>0; i--) {
			for(int j=1; j<(i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=5; i>0; i--) {
			for(int k=6; k>(i+1); k--) {
				System.out.print(" ");
			}
			
			for(int j= 1;j<(i+1);j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int k=5; k>(i+1); k--) {
				System.out.print(" ");
			}
			
			for(int j= 0;j<(i+1);j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
