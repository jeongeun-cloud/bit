package java_day12;

interface Tv {
	void turnOn();
	void turnOff();
}

class SamsungTV implements Tv {
	public void powerOn() {
		System.out.println("�Ｚ tv�� �Ҵ�!");
	}
	public void powerOff() {
		System.out.println("�Ｚ tv�� ����!");
	}
	public void turnOn() {
		powerOn();
	}
	public void turnOff() {
		powerOff();
	}
	
}

class LGTv implements Tv{
	public void turnOn() {
		System.out.println("LG tv�� �Ҵ�!");
	}
	public void turnOff() {
		System.out.println("LG tv�� ����!");
	}
	
}

public class Ch05Ex32 {
	static void tvPlayer (Tv tv) {
		tv.turnOn();
		tv.turnOff();
	}

	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tvPlayer(tv);
		
		LGTv tv2 = new LGTv();
		tvPlayer(tv2);

	}

}
