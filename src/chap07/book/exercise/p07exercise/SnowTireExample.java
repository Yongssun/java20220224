package chap07.book.exercise.p07exercise;

public class SnowTireExample {
 public static void main(String[] args) {
	SnowTire snowTire = new SnowTire();
	Tire tire = snowTire;
	
	snowTire.run();
	tire.run();
}
}
