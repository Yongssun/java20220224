package chap13.book.exercise.p3;

import java.awt.Container;

public class ContainerExample {
public static void main(String[] args) {
	Container<String,String> container1 = new Container<String,String>();
	container1.set("홍길도","도적");
	String name1= container1.getKey();
	String job = container1.getValue();
	
	Container<String,Integer> container2 = new Container<String,Integer>();
	container2.set("홍길도", 35);
	String name2= container2.getKey();
	Integer age = container2.getValue();
	System.out.println(age);
	
}
}


class Container<T,U>{
	private T key;
	private U value;
	public void set(T key, U value) {
		this.key = key;
		
	}
	public T getKey() {
		return key;
	}
	
	public U getValue() {
		return value;
	}
	
	
	
}
