package book_practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07 {

	static Scanner scan = new Scanner(System.in);
	public static void ex01(String[] args) {
		
		while (true) {
			System.out.print(">> ");
			String query = scan.nextLine();
	
			if(query.equals("그만")) {
				System.out.println("종료합니다...");
				System.exit(0);
			}
			
			StringTokenizer st = new StringTokenizer(query, " ");
			System.out.println("어절 개수는 : " + st.countTokens());
		}
		
	}
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.print(">> ");
			String query = scan.nextLine();
			
			if(query.equals("그만")) {
				System.out.println("종료합니다...");
				System.exit(0);
			}
			
			String[] a = query.split(" ");
			System.out.println("어절 개수는 " + a.length);
		}
	}
	
}
