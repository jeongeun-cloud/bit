package org.comstudy21.ch02;

//static import
import static java.lang.System.out;

import java.util.Scanner;

public class Ch02Ex03 {
	public static void main(String[] args) {
		//������ �Է��� ���� Scanner ��ü ����
		Scanner scan = new Scanner(System.in); //Scan ���� ctrl + space bar �ϰ� �´� �� ã�� Ŭ���ϸ� ����Ʈ ��
				
		// ���� ����		
		int cnt01 = 5, price = 2400, cnt02 = 12;
		
		out.print("cnt01 �Է� : ");
		cnt01 = scan.nextInt();
		out.print("price �Է� : ");
		price = scan.nextInt();
		out.print("cnt02 �Է� : ");
		cnt02 = scan.nextInt();
		
		
		out.printf("������ ���뿡 %d�ڷ� �ִ�.\n", cnt01);		
		out.printf("���� �� �ٽ���  %d���ε�\n", price);		
		out.printf("�� �ٽ����� ������ %d�ڷ� �ִ�.\n", cnt02);		
		
	}

}
