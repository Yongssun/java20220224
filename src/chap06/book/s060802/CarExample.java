package chap06.book.s060802;

public class CarExample {
public static void main(String[] args) {
	Car myCar = new Car();
	
	myCar.setGas(5);
	boolean gasState=myCar.isLeftGas();
	if(gasState) {
		System.out.println("출발합니다");
		myCar.run();
	}
	if(myCar.isLeftGas()) {
		System.out.println(("gas를 주입필요"));
		
	}else {
		System.out.println("gas를 주입하세요");
	}
}
}
