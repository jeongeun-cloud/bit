package org.comstudy21.ch02;

import static java.lang.System.out;
import java.util.Scanner;

public class Ch02Ex04 {
	public static void main(String [] args){
		// Scanner�� �̿��ؼ� ���α���, ���α��̸� �Է� �޾Ƽ� 
		// ���簢���� ���̸� ����ϴ� ���α׷� �����϶�.
		// ���������� ����� �ʱ�ȭ �ʼ�
		
		// ���� ���� 
		double width = 0, height = 0;
				
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		
		out.print("���� �Է� : ");
		width = scan.nextDouble();
		out.print("���� �Է� : ");
		height = scan.nextDouble();
		
		out.printf("���� ���̴� %.1f�̰�, ���� ���̴� %.1f�Դϴ�. \n�� ���簢���� ���̴� %.1f �Դϴ�.", width, height, width*height);
		
		
	}
}
