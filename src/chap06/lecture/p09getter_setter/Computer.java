package chap06.lecture.p09getter_setter;

public class Computer {
	private int ssd; //읽기 전용
	private int ram;// private 클래스 내에서만 접근 가능
	public Computer() {
		ssd=1000;
	}
	public int getSsd() {
		return this.ssd;
	}
	public void setRam(int ram) {
		if (ram < 0) {
			this.ram =4;
		} else {
			this.ram = ram;
		}
	}

	public int getRam() {
		return this.ram;
	}
}
