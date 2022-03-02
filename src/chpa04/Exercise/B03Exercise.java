package chpa04.Exercise;

public class B03Exercise {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}else {
				sum+=0;
			}
		}
		System.out.println(sum);
		int sum2=0;
		for(int i=0; i<=100;i+=3) {
			sum2 += i;
		}
		System.out.println(sum2);
	}
}
