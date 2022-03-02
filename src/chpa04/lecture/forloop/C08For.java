package chpa04.lecture.forloop;

public class C08For {
	public static void main(String[] args) {

		int[] arr1 = { 3, 1, 9, 2, 7 };
		//arr1에 있는 모든값을 더해서 출력
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			
			sum += arr1[i];
			
		}
		System.out.println(sum);
		
		//arr1의 값 중 가장큰 값을 구해서 출력
		int max=arr1[0];
		for(int i= 1;i<arr1.length; i++) {
			max=(max < arr1[i]) ? arr1[i]:max;
			
		}
		System.out.println(max);
		int min=arr1[0];
		for(int i= 1;i<arr1.length; i++) {
			min=(min > arr1[i]) ? arr1[i]:min;
			
		}
		System.out.println(min);
	}
}
