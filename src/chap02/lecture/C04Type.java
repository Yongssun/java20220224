package chap02.lecture;

public class C04Type {
	public static void main(String[] args) {
		
		double v1 = 3.14;
		//int v2= 3.14; x
		//������ Ÿ��(�ڷ���)datatype
		//�⺻ ������Ÿ��(primitive)
		//���� 0,1,3,
		//byte,short,int,long
		
		//�Ǽ�
		//float,double
		
		//��
		//boolean
		
		//����
		//char
		
		//������(reference)�� 8�� ���� ��
		//5é�� ����
/////////////////////////////////////////
		//���� (byte(1), short(2), int(4), long (8))
	//1byte=8bit
		int var2 = Integer.MAX_VALUE;
		System.out.println(var2);
		int var4 = Integer.MIN_VALUE;
		System.out.println(var4);
		
		
		short var6 = Short.MAX_VALUE;
		System.out.println(var6);
		short var7 = Short.MIN_VALUE;
		System.out.println(var7);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		long val10 = 9223372036854775807l;//if int< maxvalue  it change to int  so l(L) behind
		System.out.println(val10);
		// ū ���� ���� _ ���հ���
		int val11=2_3812_2880;
		System.out.println(val11);
	}
}
