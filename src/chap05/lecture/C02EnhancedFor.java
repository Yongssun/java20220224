package chap05.lecture;

public class C02EnhancedFor {
	public static void main(String[] args) {
		int[] arr= {-1,2,10,13};
		int sum=0;
		for(int item:arr) {
			sum+=item;
		}
		System.out.println(sum);
	}
}
