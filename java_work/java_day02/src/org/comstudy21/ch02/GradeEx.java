package org.comstudy21.ch02;

import java.util.Scanner;

public class GradeEx {
	
	public static void main(String[] args){
	// ����, ����, ����, ���� ������ �Է� �޾Ƽ� ����, ����� ����ϴ� ���α׷��� ������	
		
		// ��ü ����
		Scanner scan = new Scanner(System.in);
		
		// ���� ����
		String name = "";
		int ko = 0, en = 0, math = 0;
		int sum = 0;
		int avg = 0;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = scan.nextLine();
		
		System.out.print("���� ���� �Է� : ");
		ko = scan.nextInt();
		System.out.print("���� ���� �Է� : ");
		en = scan.nextInt();
		System.out.print("���� ���� �Է� : ");
		math = scan.nextInt();
		
		sum = ko + en + math;
		avg = sum / 3;
		
		System.out.printf("%s�л��� ����� %d��, ������ %d��, ����� %d�� �Դϴ�.\n",name,ko,en,math);
		System.out.print(name+"�л��� ��� ������ ����"+sum+"�̰�, ����� "+avg+"�� �Դϴ�.");
		
	}

}
