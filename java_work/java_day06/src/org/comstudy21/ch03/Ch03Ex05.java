package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex05 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int intArray[] = new int[5]; // �迭 ����
		int max = 0;
		
		System.out.println("��� 5���� �Է��ϼ���.");
		
		for(int i=0; i<5; i++){
			intArray[i] = scan.nextInt(); // �Է� ���� ������ �迭�� ����
			if(intArray[i]>max){ // intArray[i]�� ���� ���� ū �� ���� ũ��
				max = intArray[i]; // intArray[i]�� max�� ����
			}
		}
		
		System.out.println("���� ū ���� "+max+"�Դϴ�.");
		
		scan.close();
	}
}
