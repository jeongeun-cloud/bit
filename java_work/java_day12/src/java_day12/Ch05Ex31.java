package java_day12;

interface �达���� {
	void �达��������();
}

interface �ھ����� {
	void �ھ���������();
}

abstract class ȫ������ {
	abstract void ȫ����������();
}

class ȫ�浿 extends ȫ������ implements �达����, �ھ�����{
	public void ȫ����������() {
		System.out.println("ȫ������ ���� ����");
	}
	public void �达��������() {
		System.out.println("�达���� ���� ����");
	}
	public void �ھ���������() {
		System.out.println("�ھ����� ���� ����");
	}
	
}

public class Ch05Ex31 {
	public static void main(String[] args) {
		ȫ�浿 hong = new ȫ�浿();
		if (hong instanceof ȫ������) {
			hong.ȫ����������();
		}
		if (hong instanceof �达����) {
			hong.�达��������();
		}
		if (hong instanceof �ھ�����) {
			hong.�ھ���������();
		}
		
		
		ȫ������ hongHouse = new ȫ�浿();
		if (hongHouse instanceof ȫ������) {
			hongHouse.ȫ����������();
		}
		if (hongHouse instanceof �达����) {
			((�达����)hongHouse).�达��������(); // ĳ����
		}
		if (hongHouse instanceof �ھ�����) {
			((�ھ�����)hongHouse).�ھ���������(); // ĳ����
		}	
		
	}
}
