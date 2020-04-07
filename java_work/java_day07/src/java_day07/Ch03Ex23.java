package java_day07;

import java.util.Scanner;

public class Ch03Ex23 {
	static Scanner scan = new Scanner(System.in);
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static int month = 0;
	static int day = 0;
	static int total = 0;	
	
	
	public static void main(String[] args) {
		// �Է¹��� ~�� ~�� ���� 100�� ���� ��¥ ���
		// 100���� �� ������ ���� - 100�� ������ ����� �޿��� ��ġ�� ��ŭ ���ش�.
		
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();
		
		total = days[month-1] - day; // �ش� ���� ���� ��¥ ����
		int i = 0;
		for(i=month; total<100; i++){
			i = i % 12;
			total += days[i];			
		}
		
		int nextMonth = i;
		int nextDay = days[i-1] - (total - 100);
		System.out.printf("%d�� %d�Ϸ� ���� 100�� �Ĵ� %d�� %d���Դϴ�.", month, day, nextMonth, nextDay);
		
	}
	
	
	
	public static void test04(String[] args) {
		// �Է¹��� ~�� ~�� ���� 100�� ���� ��¥ ���
		// total�� 100�� �ְ� ��������
		
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();
		
		total = 100 - (days[month-1] - day);
		int i = month % 12;
		while(days[i] < total){
			total -= days[i++];
			i = i % 12;
		}
		
		int nextDay = total;
		int nextMonth = i+1;
				
		System.out.printf("%d�� %d�Ϸ� ���� 100�� �Ĵ� %d�� %d���Դϴ�.", month, day, nextMonth, nextDay);
		
	}
	
	
	
	public static void test03(String[] args) {
		// �Է��Ͻ� ~�� ~�� ���� 1���� total�� ���ҽ��ϴ�.
		
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();
		
		total = days[month-1] - day;
		
		for(int i=month; i<days.length; i++){
			total += days[i];
		}
		System.out.printf("%d�� %d�Ϻ��� 1���� ���� ��¥�� %d���Դϴ�.", month, day, total);
	}
	
	
	
	public static void test02(String[] args) {
		// ��, �� �Է� -> 1�� 1�� ���� ~�� ~�� ������ �� total�Դϴ�.

		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		System.out.print("�� �Է� : ");
		day = scan.nextInt();
		
		total = day; // �Է� ���� ���� ��¥ �Է�
		
		for(int i=0; i<month-1; i++){
			total += days[i];
		}
		System.out.printf("1�� 1�Ϻ��� %d�� %d�ϱ����� ��¥�� �� %d�� �Դϴ�.",month, day, total);
	}
		
	
	
	public static void test01(String[] args) {
		// ���� �Է� �޾Ƽ� �ش� ���� ��¥ ���� ����Ѵ�.
		
		System.out.print("�� �Է� : ");
		month = scan.nextInt();
		
		System.out.printf("�Է��Ͻ� %d���� ��¥ ���� %d���Դϴ�",month,days[month-1]);
	}
}