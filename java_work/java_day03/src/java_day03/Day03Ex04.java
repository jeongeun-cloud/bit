package java_day03;

import java.util.Scanner;

public class Day03Ex04 {
	
	
	
	public static void test2(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("���� : ");
		String name = scan.next();
		scan.nextLine();
		
		System.out.print("�ּ� �Է� : ");
		// nextLine() ���� �Է� ����
		String addr = scan.nextLine();

		System.out.println("���� : " + name);
		System.out.println("�ּ� : " + addr);
		
	}
	
	
	
	public static void test(String[] args) {
		
		Scanner scan = new Scanner("500 Hello true Korea 3.14");
		
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
				
	}
}
