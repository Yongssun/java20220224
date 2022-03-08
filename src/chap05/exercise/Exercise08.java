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
	int[][] array1=new int[array.length][array[array.length-1].length];
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array[array.length-1].length;j++) {
			sum+=array1[i][j];
			a++;
		}
	}
	arg=sum/a;
	System.out.println(sum);
	System.out.println(arg);
}
}
