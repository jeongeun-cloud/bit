package org.comstudy21.ch01;

import java.io.IOException;

public class Day02Ex03 {
	
	public static void main(String[] arg) throws IOException {
		// System.in �ʵ带 �̿��ؼ� ������ �Է� �ޱ�
		// Scanner�� �̿��ϸ� �� ���ϴ�.
		
		System.out.print("���� �Է� : "); // ���̸� �Է� �޾Ƽ� ����Ѵ�.
		int age = System.in.read() - '0';   
		age = age * 10; //�ڸ� �� �÷��ֱ� 
		age += System.in.read() - 48;  
		
		// Ű������ �ƽ�Ű�ڵ�(�����ڵ�)�� �Էµȴ�. 
		// 0 - 48, 1 - 49 , 2 - 50 , 3 - 51
		// System.in.read(); �� �� ���� �� ���ڸ� ���� , �׷��� 26 �Է��ص� 50���� ���. 
		
		
		System.out.printf("���� : %d\n", age);
			
	}

}
