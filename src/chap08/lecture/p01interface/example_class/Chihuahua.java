package chap08.lecture.p01interface.example_class;

public class Chihuahua extends Canine implements Pet{

	@Override
	public void cry() {
		System.out.println("멍멍");
		
	}

	@Override
	public void roll() {
	System.out.println("치와와가 뭅니다 ");
		
	}
	
}