package chap05.exercise;

public class Exercise08 {
public static void main(String[] args) {
	int[][] array= {
			{95,86},
			{83,92,96},
			{78,83,93,87,88}
	};
	
	int sum=0;
	int a=0;
	double arg=0.0;
	int cnt=0;
//	for(int i=0;i<array.length;i++) {
//		for(int j=0;j<array[i].length;j++) {
//			sum+=array[i][j];
//			a++;
//		}
//	}
//	arg=(double)sum/10;
	for(int[] item:array) {
		for(int num :item) {
			sum+=num;
			cnt++;
		}
	}
	arg=(double)sum/cnt;
	System.out.println(sum);
	System.out.println(arg);
}
}
