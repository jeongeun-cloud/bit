package java_day07;

// enum �����ϱ�
// 1) .java ����
// 2) Ŭ���� �ȿ� ����
// 3) Ŭ���� �ܺο� ����
//

enum Case {
	����, ����, ��
}

public class Ch03Ex25 {
	
	public static void main(String[] args) {
		// values()�Լ� : ������ ����� �迭�� ��ȯ
		// valueOf()�Լ� : �μ��� �־��� String�� ���� ������ ���� ã�� - ���� ���Ұ� ������ ���ܹ߻�
		// ordinal()�Լ� : ���ŵ� ������ ������ ��ȯ
		
		System.out.println(Case.����);
		Case c1 = Case.����;
		Case c2 = Case.����;
		Case c3 = Case.��;
		
		switch(c2){
		case ���� : System.out.println("���� ����!");break;
		case ���� : System.out.println("���� ����!");break;
		case �� : System.out.println("�� ����!");break;
		}
		
		if(c2 == Case.����){
			System.out.println("���� �Դϴ�!");
		}
	}

}
