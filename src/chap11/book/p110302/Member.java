package chap11.book.p110302;

public class Member {
public String id;

public Member(String id) {
	this.id= id;
}
@Override
public boolean equals(Object obj) {
	if(obj instanceof Member) {
		Member member=(Member)obj;
	if(id.contentEquals(member.id)) {
		return true;
	}
	}
	return false;
}
@Override
public int hashCode() {
	return id.hashCode();
}
}