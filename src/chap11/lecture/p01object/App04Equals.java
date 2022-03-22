package chap11.lecture.p01object;

public class App04Equals {
public static void main(String[] args) {
	Desk d1=new Desk("a01");
	Desk d2=new Desk("b01");
	Desk d3=new Desk("a01");
	
	
	System.out.println(d1==d2);
	System.out.println(d1==d3);
	System.out.println(d1.equals(d3));
	
	String s1=new String("java");
	String s2=new String("java");
	
	System.out.println(s1.equals(s2));
}
}
class Desk {
	private String model;
	
	Desk(String model){
		this.model =model;
	}
	@Override
	public boolean equals(Object obj) {
		//obj의 model 필드값과
		//this의model 필드값이 같으면  true
		if(obj instanceof Desk) {
			Desk d =(Desk)obj;
			if(d.model.contentEquals(this.model)) {
				return true;
			}
		
			}
		return false;
	}
}