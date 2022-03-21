package chap10.lecture.p06custom;

public class App01 {
public static void main(String[] args) {
	try {
		method1(200);
	}catch(ValueOutOfBOundsException e){
		e.printStackTrace();
	}
}
private static void method1(int value)throws ValueOutOfBOundsException{
	if(value >100) {
		throw new ValueOutOfBOundsException("value:"+value);
	}
	System.out.println("실행 이어감");
}
}
