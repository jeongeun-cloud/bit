package org.comstudy21.ch04.ex04;


class �ҹ� {
	public void ����() {
		System.out.println("�ҹ谡 ������ �д�~ ");
	}
}

// is A ����
class �ƹ� extends �ҹ� {
	@Override
	public void ����() {
		System.out.println("�ƹ谡 ������ �д�~");
	}
}

// is A ����
class ���� extends �ƹ� {
	
	public void ����() {
		System.out.println("���ڰ� ������ �д�~");
	}
}


public class Ch10Ex04 {
	
	public static void main(String[] args) {
		�ҹ� hal = new �ҹ�();
		hal.����(); // �ҹ� ����
		
		hal = new �ƹ�();
		hal.����(); // �ƹ� ����
		
		hal = new ����();
		// ���� son = new �ҹ�(); �Ұ���
		hal.����(); // ���� ����
		
		// ��� Ŭ������ Object�� ���������� ��� �޴´�.
		Object obj = hal; // ���������� ��� �޾Ƽ� ����
		// �θ� Ŭ������ ���� ���� ���� �ڼ��� ����� ȣ�� �� �� ����.
		// obj.����(); // �׷��� �Ұ���
		// �ڼ����� ����ȯ(ĳ����) �ϸ� ȣ�� �����ϴ�.
		((�ƹ�)obj).����(); // �׷��� ���� - > ����� ���ڷθ�
		
	}

	
	public static void test(String[] args) {
		�ҹ� halbe = new �ҹ�();
		�ƹ� abe = new �ƹ�();
		���� sonja = new ����();
		
		System.out.println(sonja instanceof ����);
		System.out.println(sonja instanceof �ƹ�);
		System.out.println(sonja instanceof �ҹ�);
		
		System.out.println(halbe instanceof ����);
		System.out.println(halbe instanceof �ƹ�);
		System.out.println(halbe instanceof �ҹ�);

	}

}
