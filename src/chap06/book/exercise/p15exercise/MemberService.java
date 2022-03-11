package chap06.book.exercise.p15exercise;

public class MemberService {
	public boolean login(String id,String password) {
		return id.equals("hong")&&password.equals("12345");
	}
	public void logout(String id) {
		if (id.equals("hong")){
			System.out.println("로그아웃되었습니다.");
		}else {
			System.out.println("잘못된 id 입니다");
		}
	}
}
