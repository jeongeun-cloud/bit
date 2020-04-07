package java_day03;

import java.util.Scanner;

public class Day03Ex04 {
	
	
	
	public static void test2(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("성명 : ");
		String name = scan.next();
		scan.nextLine();
		
		System.out.print("주소 입력 : ");
		// nextLine() 공백 입력 가능
		String addr = scan.nextLine();

		System.out.println("성명 : " + name);
		System.out.println("주소 : " + addr);
		
	}
	
	
	
	public static void test(String[] args) {
		
		Scanner scan = new Scanner("500 Hello true Korea 3.14");
		
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
				
	}
}
