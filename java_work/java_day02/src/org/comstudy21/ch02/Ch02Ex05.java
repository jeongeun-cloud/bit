package org.comstudy21.ch02;

import static java.lang.System.out;
import java.util.Scanner;

public class Ch02Ex05 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
				
		double area = 0; // ���� ����
		double line = 0; // ���� �ѷ��� ����
		double r = 0; // ������
		final double PI = 3.141592;
		
		// ���� �������� �Է� �޾Ƽ� �ѷ��� ���̿� ������ ����ϴ� ���α׷�
		
		out.print("������ �Է� : ");
		r = scan.nextDouble();
		area = r * r * PI;
		line = r * 2 * PI;
		
		out.printf("�������� %.1f�̰�, ���� �ѷ��� ���̴� %.1f�̰�, ������ %.1f �Դϴ� \n", r , line, area);
		// ���ϴ� ��ŭ �Ҽ��� �ݿø� �� ���
		
		// out.print("�������� "+r+"�̰�, ���� �ѷ���" +line+"�̰�, ������ "+area+"�Դϴ�.");
		// �Է¹��� ��ŭ ����ؼ� ���
		
	}

}
