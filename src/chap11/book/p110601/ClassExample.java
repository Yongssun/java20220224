package chap11.book.p110601;

import chap06.book.s060802.Car;

public class ClassExample {
public static void main(String[] args) {
	Car car = new Car();
	Class class1= car.getClass();
	System.out.println(class1.getName());
	System.out.println(class1.getSimpleName());
	System.out.println(class1.getPackage().getName());
	
	try {
		Class class2=Class.forName("chap06.book.s060802.Car");
		System.out.println(class2.getName());
		System.out.println(class2.getSimpleName());
		System.out.println(class2.getPackage().getName());
	} catch(ClassNotFoundException e){
		e.printStackTrace();
	}
}
}
