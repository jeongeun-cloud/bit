package org.comstudy21.ch02;

import java.util.Scanner;

public class Ch02Ex10 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// ���̸� �Է� �޴´�.
		// �̼�����, û��, ���, ����� �����ϴ� ���α׷� 
		// 0~19, 20~40, 41~65, 66~
		
		int age = 0;
		String result ="�̼�����";
		
		System.out.print("���� �Է� : ");
		age = scan.nextInt();
		
		while (age < 0 || age > 150){ //(!(age >= 0 && age <= 150))
			System.out.println("Error! ��ȿ���� ���� ���Դϴ�!");
			System.out.print("���� �Է� : ");
			age = scan.nextInt();
		}
		

//		do ~ while �� �ٲ� ��, while �ڿ� �����ݷ� �ʼ�!
//				
//		do{
//			System.out.println("Error! ��ȿ���� ���� ���Դϴ�!");
//			System.out.print("���� �Է� : ");
//			age = scan.nextInt();
//		}while (age < 0 || age > 150);
			
			
		if(age<20){
			System.out.println(result);
		}else if(age <= 40){
			result = "û��";
			System.out.println(result);
		}else if(age <= 65){
			result = "���";
			System.out.println(result);
		}else{
			result = "���";
			System.out.println(result);
		}
		
		
		
	//	if(age > 65){
	//		result = "���";
	//	}else if(age > 40){
	//		result = "���";
	//	}else if(age > 19){
	//		result = "û��";
	//	}
	//	System.out.printf("%d���� %s�Դϴ�", age, result);	
		
	}
}
