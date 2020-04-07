package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex11 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int score = 0;
		String grade ="F";
		
		System.out.print("���� �Է� : ");
		score = scan.nextInt();
		
		while(!(score >= 0 && score <=100)) {
			System.out.println("��ȿ���� ���� ������ �Է��Ͽ����ϴ�");
			System.out.print("���� �Է� : ");
			score = scan.nextInt();
			
		}
		// ������ ������ �����ϸ� ��� Ÿ���� �������̴�.
		switch(score/10){
		case 10 : 
		case 9 : 
			grade = "A"; 
			break;
		case 8 :
			grade = "B"; 
			break;
		case 7 :
			grade = "C"; 
			break;
		case 6 :
			grade = "D"; 
//			break;
//		default : 
//			grade = "F";
		}
		
		
		// A+, A-, A �������� ������
		
		switch(score/10){
		case 10:
			grade += "+";
			break;
		case 9: case 8: case 7: case 6:
			switch(score%10){
			case 9: case 8: case 7:
				grade += "+";
				break;
			case 2: case 1: case 0:
				grade += "-";
				break;
			}
		}
				
		System.out.printf("%d���� %s�����Դϴ�.", score, grade);
		
	}

}
