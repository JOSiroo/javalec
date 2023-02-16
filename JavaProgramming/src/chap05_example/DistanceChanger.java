package chap05_example;

public class DistanceChanger {
    //변환할 거리 long(m)
	private long num1;
	private String op;
	
	public DistanceChanger() {
		
	}
	//변환할 단위(cm, mm, km, inch)
	public DistanceChanger(long num1, String op) {
		this.num1 = num1;
		this.op = op;
	}
	//기본 생성자
	public long cm() {
		return num1 * 100;
	}
	public long mm() {
		return num1 * 100;
	}
	public double km() {
		return num1 / 1000;
	}
	public long inch() {
		return num1 / 39;
	}
	//생성자(거리와 단위) => 멤버변수 초기화
	public void distan() {
		switch(op) {
		case "cm" :
			System.out.println((num1 + " " + "m" + " = " + cm() + "cm"));
			break;
		case "mm" :
			System.out.println((num1 + " " + "m" + " = " + mm() + "mm"));
			break;
		case "km" :
			System.out.println(((double)num1) + " " + "m" + " = " + km() + "km");
			break;
		case "inch" :
			System.out.println((num1 + " " + "m" + " = " + inch() + "inch"));
			break;
		}
	}
	//선택된 단위로 거리를 변환해서 출력하는 메소드(m -> inch = 254로 나누기)
}
