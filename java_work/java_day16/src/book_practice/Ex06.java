package book_practice;

import java.util.Calendar;
import java.util.Scanner;

public class Ex06 {
static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int nowSec = 0;
		int afterSec = 0;
		String res = "";
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");
		System.out.print("������ ���� <Enter>Ű >>");
		scan.nextLine();
		Calendar now = Calendar.getInstance();
		nowSec = now.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + nowSec);
		
		System.out.print("10�� ���� �� <Enter>Ű >>");
		scan.nextLine();
		Calendar after = Calendar.getInstance();
		afterSec = after.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + afterSec);
		if(afterSec<nowSec) {
			afterSec+=60;
		}
		int result = afterSec-nowSec;
		System.out.println(result);
		
		
		System.out.print("ģ�� ���� <Enter>Ű >>");
		scan.nextLine();
		Calendar now2 = Calendar.getInstance();
		nowSec = now2.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + nowSec);

		
		System.out.print("10�� ���� �� <Enter>Ű >>");
		scan.nextLine();
		Calendar after2 = Calendar.getInstance();
		afterSec = after2.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + afterSec);
		if(afterSec<nowSec) {
			afterSec+=60;
		}
		int result2 = afterSec-nowSec;
		System.out.println(result2);
		
		if(Math.abs(result-10)<Math.abs(result2-10)) {
			res = "������ ��!";
		} else if(Math.abs(result-10)>Math.abs(result2-10)) {
			res = "ģ�� ��!";
		} else {
			res = "���º�!";
		}
		
		System.out.printf("�������� ��� : %d, ģ���� ��� %d, ���ڴ� %s", result, result2, res);
		
	}
	
}