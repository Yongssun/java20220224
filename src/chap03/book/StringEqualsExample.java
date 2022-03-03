package chap03.book;

public class StringEqualsExample {
	public static void main(String[] args) {
		String starval1 = "신민철";
		String starval2 = "신민철";
		String starval3 =new String( "신민철");
		
		System.out.println(starval1 == starval2);
		System.out.println(starval1 == starval3);
		System.out.println();
		System.out.println(starval1.contentEquals(starval2));
		System.out.println(starval1.equals(starval3));
	}
}
