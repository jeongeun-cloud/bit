package org.comstudy21.ch02;
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

import java.util.Scanner;

public class IntroEx {
	public static void main(String[] args){
	// --- �ڱ�Ұ��� ��� �� �����͸� �Է¹޾Ƽ� ����ϴ� ���α׷� �����
		
		// ��ü ����
		Scanner scan = new Scanner(System.in);
		
		// ���� ����
		String name = "", address = "",  major ="",  job="", special="", blood="", dream="" ;
		int age = 0 ;
		double sight = 0, hieght = 0;
		
		System.out.print("�̸��� �Է��ϼ��� :");
		name = scan.next();
		System.out.print("���̸� �Է��ϼ��� :");
		age = scan.nextInt();
		System.out.print("��� ���� �Է��ϼ��� :");
		address = scan.next();
		System.out.print("������ �Է��ϼ��� :");
		major = scan.next();
		System.out.print("������ �Է��ϼ��� :");
		job = scan.next();
		System.out.print("Ư�⸦ �Է��ϼ��� :");
		special = scan.next();
		System.out.print("Ű�� �Է��ϼ��� :");
		hieght = scan.nextDouble();
		System.out.print("�÷��� �Է��ϼ��� :");
		sight = scan.nextDouble();
		System.out.print("�������� �Է��ϼ��� :");
		blood = scan.next();
		System.out.print("�巡����� �Է��ϼ��� :");
		dream = scan.next();
		
		System.out.println();
		System.out.println("----"+name+"�� �ڱ�Ұ�----");
		System.out.println();
		System.out.println("�̸� : "+name);
		System.out.printf("���� : %d \n��°� : %s \n���� : %s \n���� : %s \n", age, address, major, job);
		System.out.println("Ư�� : "+special);
		System.out.printf("Ű : %.1f \n�÷� : %.1f", hieght, sight);
		System.out.print("������ : " + blood + "\n�巡��� : " + dream);
	
	}
}
