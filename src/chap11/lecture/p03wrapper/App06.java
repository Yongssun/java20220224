package chap11.lecture.p03wrapper;

public class App06 {
public static void main(String[] args) {
	int[] arr=new int[3];
	arr[0] =2;
	
	Integer i1= new Integer(999);
	arr[1]=i1;
	
	double[] arr1 = new double[3];
	arr1[0]= 3.14;
	arr1[1] = 219171979213L;
	arr1[2]= 123414;
	
	//배열에 Double, Long, Integer
	Number[] arr2 = new Number[3];
	arr2[0]= 3.14;
	arr2[1]=292935425253L;
	arr2[2]=12341;
	
	double d1=(Double)arr2[0];
	long l1=(Long)arr2[1];
	int i2=(Integer)arr2[2];
	
}
}
