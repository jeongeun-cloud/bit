package org.comstudy21.ch01;
/**
 * print(), println(), printf() g�Լ��� ������ ����ؼ� ���� ���� ���
 * 1. ����
 * 2. ����
 * 3. ��°�
 * 4. ����
 * 5. ����
 * 6. Ư��
 * 7. Ű
 * 8. �÷�
 * 9. ������
 * 10. �巡���
 *
 */

// static import�� out �ʵ� ��ü �ҷ�����
// import ������Ʈ �ܺο� ����� Ŭ������ ��ü�� �ҷ��´�.
// ��Ģ������ System Ŭ������ import �ؾ� �Ѵ�.
// java.lang ��Ű���� ����Ʈ ��Ű���̹Ƿ� import�� ���� ���� (import java.lang.System;)
// java.lang.System.out.println ���� �̷��� ����� 


// import java.lang.System; -- ���� ���� 
import static java.lang.System.out;
import static java.lang.System.err;

public class Day02Ex02 {

	public static void main(String[] args){
		
//		java.lang.System.out.println(""); -- ���� �̷��� �����
		out.println("--- �ڱ� �Ұ� ---");
		
		err.println("�����޼��� : ����!"); // �����尡 �޶� ��ġ�� �ڹٲ������.
	
	}

}



/*public class Day02Ex02 {

public static void main(String[] args){
	
	System.out.println("--- �ڱ� �Ұ� ---");
	System.out.printf("���� : %s , ���� : %d ", "������", 26 );
	System.out.println();
	System.out.println("��°� : ����� ���빮�� ��ε�");
	System.out.println("���� : " + "��ǻ�� ���а�");
	System.out.print("���� : �п� ������ \n");
	System.out.printf("Ű : %d, �÷� : %.1f, ������ : %s", 163 , 0.4, "O��\n");
	System.out.print("�巡��� : ������ ");
			
	}

}
*/