package chap06.book.exercise.p13exersice;

public class Member {
	String name;
	String id;
	String password;
	int age;
	Member(String name,String id,String password,int age){
		this.name = name;
		this.id=id;
		this.password=password;
		this.age=age;
	}
	public Member(String name,String id){
		super();
		this.name=name;
		this.id=id;
	}
	}
