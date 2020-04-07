package book_practice;

import java.util.Calendar;
import java.util.Scanner;

public class Ex06 {
static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int nowSec = 0;
		int afterSec = 0;
		String res = "";
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		System.out.print("주정은 시작 <Enter>키 >>");
		scan.nextLine();
		Calendar now = Calendar.getInstance();
		nowSec = now.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + nowSec);
		
		System.out.print("10초 예상 후 <Enter>키 >>");
		scan.nextLine();
		Calendar after = Calendar.getInstance();
		afterSec = after.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + afterSec);
		if(afterSec<nowSec) {
			afterSec+=60;
		}
		int result = afterSec-nowSec;
		System.out.println(result);
		
		
		System.out.print("친구 시작 <Enter>키 >>");
		scan.nextLine();
		Calendar now2 = Calendar.getInstance();
		nowSec = now2.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + nowSec);

		
		System.out.print("10초 예상 후 <Enter>키 >>");
		scan.nextLine();
		Calendar after2 = Calendar.getInstance();
		afterSec = after2.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + afterSec);
		if(afterSec<nowSec) {
			afterSec+=60;
		}
		int result2 = afterSec-nowSec;
		System.out.println(result2);
		
		if(Math.abs(result-10)<Math.abs(result2-10)) {
			res = "주정은 승!";
		} else if(Math.abs(result-10)>Math.abs(result2-10)) {
			res = "친구 승!";
		} else {
			res = "무승부!";
		}
		
		System.out.printf("주정은의 결과 : %d, 친구의 결과 %d, 승자는 %s", result, result2, res);
		
	}
	
}