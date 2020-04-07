package book_practice;

import java.util.Scanner;

public class Ex11 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print(">> ");
		StringBuffer str = new StringBuffer(scan.nextLine());
		
		while (true) {
			System.out.print("명령 : ");
			String order = scan.nextLine();
			if (order.equals("그만")) {
				System.out.println("종료합니다");
				System.exit(0);
			}
			String[] s = order.split("!");
			if (str.indexOf(s[0]) == -1) {
				System.out.println("찾을 수 없습니다!");
			} else {
				if (s[0].length() == 0 || s[1].length() == 1) {
					System.out.println("잘못된 명령입니다!");
				} else {
					int startP = str.indexOf(s[0]);
					int endP = str.indexOf(s[0]) + s[0].length();
					str.replace(startP, endP, s[1]);
					System.out.println(str);
				}
			} 
		}
		
	}
}