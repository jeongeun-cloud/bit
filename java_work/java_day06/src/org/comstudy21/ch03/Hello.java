package org.comstudy21.ch03;

import java.util.Scanner;

public class Hello {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String[] student = new String[2];
		System.out.println("Hello");
		System.out.print("���� �Է� : ");
		student[0] = scan.nextLine();
		System.out.print("�ּ� �Է� : ");
		student[1] = scan.nextLine();
		
		System.out.println(student[0] + " : " + student[1]);
		
	}
}
