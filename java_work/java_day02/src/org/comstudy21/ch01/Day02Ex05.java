package org.comstudy21.ch01;

import java.io.IOException;

public class Day02Ex05 {
	
	public static void main(String[] args) {
		
		System.out.printf("%c, %d \n", '0', (int)'0');
		System.out.printf("%c, %d \n", 'A', (int)'A');
		System.out.printf("%c, %d \n", 'a', (int)'a');
		
	}
	
	
	public static void test(String[] args) throws IOException {
		//Scanner ���� �Է� (java.util)
		// ���� �Է� -> �̸� �Է�
		
		int age = 0; // ���� ���� �� �ʱ�ȭ
		int name = 0;
		
		System.out.print("�����Է� : ");
		age = System.in.read() - '0';
		System.in.read();
		System.in.read();
		
		System.out.print("�̸��Է� : ");
		name = System.in.read();

		System.out.printf("����: %d, �̸�: %c", age, name);
	}

}
