package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex02 {
	// (Ŭ����) ��� �ʵ�
	static Scanner scan = new Scanner(System.in);
	
	// (Ŭ����) ��� �޼ҵ�
	public static void main(String[] args) {
		int score = 0;
		
		// ������ �Է� �޾Ƽ� 80�� �̻��̸� Pass		
		System.out.print("���� �Է� : ");
		score = scan.nextInt(); //static ����� static ����� ȣ�� ����
		
		
		if(score >= 80){
			System.out.println("Pass");
			System.out.println("���α׷� ����!");
		} else {
			main(null);
		}
			
		
		//System.out.println("���α׷� ����!");

	}

}
