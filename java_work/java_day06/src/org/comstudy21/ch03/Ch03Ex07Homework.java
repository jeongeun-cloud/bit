package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex07Homework {
	static Scanner scan = new Scanner(System.in);
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int month = 0;
	static int day = 0;
	static int total = 0;	
	
	
	public static void main(String[] args) {
		// ����
		// ��, �� �Է� �޾Ƽ�
		// ��, ���� 100�� �� ��¥�� ����ϼ���
		// �� �Է� : 11
		// �� �Է� : 30
		// >>>> 11�� 30���� 100�� �Ĵ� 3�� 9���Դϴ�.
		
		System.out.print("���� �Է� �ϼ��� : ");
		month = scan.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		day = scan.nextInt();
		
		total = days[month-1] - day; // ���� �� = ���� �� - �Է� ��
		total -= 100;
		
		System.out.println(total);
		
		for(int i=month-1; i<month+2; i++){
			total += days[i];
			System.out.println(total);
			
			if(month == 12){
				month = 1;
				month ++;
			}
			
		}
		System.out.println(month);
//		System.out.printf("%d�� %d�Ϻ��� 100�� ���� ��¥�� %d��%d�� �Դϴ�", month, day,);
		
			
			
		
		
	}
	
	
	
	public static void test2(String[] args) {
		// ��, �� �Է� �޾Ƽ�
		// ��~�� ���� 1���� ���� ��¥�� ����ϴ� ���α׷�
		// for-each ������� ���� �ϼ���
		
		System.out.print("���� �Է� �ϼ��� : ");
		month = scan.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		day = scan.nextInt();
		
		total = days[month-1] - day; // �հ� = ���� �� - �Է� ��
				
		for(int i=month; i<days.length; i++){
			total += days[i];

		}
		System.out.printf("���� ���� ��¥�� %d�� �Դϴ�",total);
		
	}
	
	
	public static void test(String[] args) {

		// total�� days�� ��Ұ��� �����Ѵ�.
		// 1���� 365�� �Դϴ�. ����ϱ�
		for(int d : days){
			total += d;
		}
		System.out.printf("1���� %d���Դϴ�. \n", days.length);
		System.out.println("1���� "+total+"�� �Դϴ�.");
		
	}
}
