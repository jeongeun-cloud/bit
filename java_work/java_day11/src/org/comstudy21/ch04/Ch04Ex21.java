package org.comstudy21.ch04;

class Super {
	String name;
//	public Super() {
//		System.out.println("���� Ŭ���� ������");
//	}
	
	// ������ �����ε�
	public Super(String name) {
		this.name = name;
		System.out.println("���� Ŭ������ ���� �ִ� ������");
	}
	public void showData() {
		System.out.println("�θ�Ŭ������ showData ȣ��");
		System.out.println("name = " + this.name);
	}
}

class Sub extends Super {
	public Sub() {
		// ������ ȣ�� ���� �ٸ� ������ �� �� ����.
		// ��������� �θ� Ŭ������ �����ڸ� ȣ�� �ؾ� �Ѵ�.
		super("Ju");
		System.out.println("���� Ŭ���� ������");
	}
	public void showData() {
		super.showData(); // ����Ŭ������ showData ȣ��
		//showData(); // �̷��Ը� ���� ���ȣ��
		//System.out.println("name = " + super.name);
	}
}

public class Ch04Ex21 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.showData();
	}

}
