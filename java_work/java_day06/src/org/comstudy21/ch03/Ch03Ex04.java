package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex04 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// �ּҸ� �����ϴ� �迭�� �����Ѵ�.
		// �ּ� 3���� �����ϰ� ����Ѵ�.
		// �ּ� ���ڿ��� ���̸� �Բ� ����Ѵ�.
		
		String[] address = new String[3];
		
		for (int i=0; i<3; i++){
			System.out.print("�ּҸ� �Է��ϼ��� : ");
			address[i] = scan.nextLine();
			
		}
		
		for (int i=0; i<3; i++){
			System.out.println("�ּҴ� " + address[i] + "�̰�, ���̴� " + address[i].length()+"�Դϴ�");
		}
		
		
	}
}
