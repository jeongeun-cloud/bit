package org.comstudy21.ch01;

import java.io.IOException;

public class Day02Ex04 {
	
	public static void main (String[] args) throws IOException{
		
		byte[] b = new byte[255];
		
		System.out.print("���� �Է� : ");
		System.in.read(b);
		
		System.out.println(new String(b).trim());
		System.out.println("�̸� ��� �Ϸ�!");
		
		System.out.print("���� �Է� : ");
		System.in.read(b);
		System.out.println(Integer.parseInt(new String(b).trim() ));
		System.out.println("���� ��� �Ϸ�!");
	}

}
