package chap06.book.s060705;



public class CarExample {
public static void main(String[] args) {
	Car car1= new Car();
	System.out.println("car1.제조사:"+car1.company);
	System.out.println();
	
	Car car2= new Car("자가용");
	System.out.println("car2.제조사:"+car2.company);
	System.out.println("car2.모델:"+car2.model);
	System.out.println();
	
	Car car3= new Car("자가용","빨강");
	System.out.println("car3.제조사:"+car3.company);
	System.out.println("car3.모델:"+car3.model);
	System.out.println("car3.색상:"+car3.color);
	System.out.println();
	Car car4= new Car("택시","검정",200);
	System.out.println("car4.제조사:"+car4.company);
	System.out.println("car4.모델:"+car4.model);
	System.out.println("car4.색상:"+car4.color);
	System.out.println("car4.최고속도:"+car4.maxSpeed);
}
}
