package chap03.lecture.binary;

public class C07Assugnment {
	public static void main(String[] args) {
		//대입연산자 ( 할당연사자)
	// =,+=,-=,*=,/=,%=
		int i= 100; //100을 i에 대입
		
		i += 3;    //i = i+3; 과 같음
		System.out.println(i);
		i -= 9;  //i = i-3;
		System.out.println(i);
		i *= 2;  //i = i * 2;
		System.out.println(i);
		
		i /= 3;   // i = i / 3;
		System.out.println(i);
		
		i %= 3;  // i =  i%3;
		System.out.println(i);
		
		int j , k , l;
		
		j = k =l = i;
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		
		
	}
}
