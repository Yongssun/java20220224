package chap07.book.p070703;

import chap07.book.p070702.HankookTire;

public class CarExample {
public static void main(String[] args) {
	Car car = new Car();
	
	for(int i=1;i<=5;i++) {
		int problemLoction = car.run();
		if(problemLoction  !=0) {
			System.out.println(car.tires[problemLoction-1].location+"HankookTire로 교체");
			car.tires[problemLoction -1]=new HankookTire(car.tires[problemLoction-1].location,15);
		}
		System.out.println("--------------------------------------");
	}
}
}
