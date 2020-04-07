package org.comstudy21.ch03;

import java.util.Scanner;

public class Ch03Ex37 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 100;
		int div = 0;
		
		System.out.print("������ �Է� : ");
		div = scan.nextInt();
		
		try{
			System.out.println("100�� "+ div +"�� ���� �� : " + 100/div);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�!");
			// System.err.println("0���� ���� �� �����ϴ�!"); //syserr (ctrl + space bar) �����޼���
			main(null); // main �ٽ� ȣ��
		}
		
		scan.close();
	}
	
	
	
	public static void test(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.print("���� �� �Է� : ");
			int div = scan.nextInt();
			
			int res = 0;
			try {
				res = 100/div;
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�!");
				continue;
			}
			System.out.println("100�� "+div+"�� ���� �� : "+ res);
			break;
		}
		
		scan.close();
		
		
	}
}
