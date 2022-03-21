package chap08.lecture.p02polymorphism;

import chap08.lecture.p01interface.example_class.Chihuahua;
import chap08.lecture.p01interface.example_class.Helper;
import chap08.lecture.p01interface.example_class.Pet;

public class App07 {
	public static void main(String[] args) {
		Pet pet = new Chihuahua();
		pet.roll();
		
		Helper helper = (Helper) pet; // ClassCastException
		helper.help();
		
		
	}
}
