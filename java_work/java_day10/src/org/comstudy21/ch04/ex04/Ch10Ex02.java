package org.comstudy21.ch04.ex04;

class ���� {
	private String �̸�;
	private String ������;
	private int �뷮;
	
	// ����Ʈ ������ - ctrl + space bar �� �ٷ� ��������
	// ����Ʈ �� �־��ֱ� - null ����Ʈ�� �ȵǱ� ����
	public ����() {
		this("no-name","no-company",0);
	}
	
	// ������ �����ε� 
	// �ڵ����ε� ���� (���콺 ��Ŭ�� -> Source -> Generate Constructor using Fields...)
	// �̶� ����� super();�� �����
	public ����(String �̸�, String ������, int �뷮){
		this.�̸� = �̸�;
		this.������ = ������;
		this.�뷮 = �뷮;
	}

	// setters and getters
	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public String get������() {
		return ������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public int get�뷮() {
		return �뷮;
	}

	public void set�뷮(int �뷮) {
		this.�뷮 = �뷮;
	}

	//toString
	@Override
	public String toString() {
		return "���� [�̸�=" + �̸� + ", ������=" + ������ + ", �뷮=" + �뷮 + "]";
	}

	
}

class ��Ź�� extends ����{
	public ��Ź��() {
		
	}
	public ��Ź��(String �̸�, String ������, int �뷮) {
		
		// �θ�Ŭ���� �����ڸ� ��������� ȣ��
		super(�̸�, ������, �뷮);
	}
	
	public void ��Ź() {
		String �̸� = super.get�̸�();
		int �뷮 = super.get�뷮();
		
		System.out.println(�̸� + " ��Ź�Ⱑ " + �뷮 +"ų���� ������ �Ѵ�");
	}
	
	public void Ż��() {
		String �̸� = super.get�̸�();
		int �뷮 = super.get�뷮();
		
		System.out.println(�̸� + " ��Ź�Ⱑ " + �뷮 +"ų���� ������ Ż���Ѵ�");
	}
	
	public void showInfo() {
		// System.out.println(super.toString());
		// ��Ź�⿡ toString()�� ���ٸ� �θ��� toString() ȣ��
		System.out.println(this); 
	}
}

public class Ch10Ex02 {

	public static void main(String[] args) {
		
		��Ź�� setac = new ��Ź��("Ʈ��","LG",100);
		setac.��Ź();
		setac.Ż��();
		setac.showInfo();
		
	}

}
