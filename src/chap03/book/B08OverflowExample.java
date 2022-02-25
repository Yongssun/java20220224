package chap03.book;

public class B08OverflowExample {
	public static void main(String[] args) {
		int x=1000000;
		int y=1000000;
		
		int z= x*y;
		System.out.println(z);
		
		long xl=1000000;
		long yl=1000000;
		
		long zl= xl*yl;
		System.out.println(zl);
	}
}
