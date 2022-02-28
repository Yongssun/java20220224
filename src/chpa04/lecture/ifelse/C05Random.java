package chpa04.lecture.ifelse;

public class C05Random {
	public static void main(String[] args) {
		double n1 = Math.random();
		System.out.println(n1);
		
		double n2= n1*10;
		System.out.println(n2);
		
		int n3=(int)n2;
		System.out.println(n3);
		int n4=n3+1;
		System.out.println(n4);
				
		System.out.println("로또번호");
		System.out.println(((int)(Math.random()*45)+1)+"번 입니다");
	}
}
