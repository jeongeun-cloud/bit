package book_practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex07 {

	static Scanner scan = new Scanner(System.in);
	public static void ex01(String[] args) {
		
		while (true) {
			System.out.print(">> ");
			String query = scan.nextLine();
	
			if(query.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				System.exit(0);
			}
			
			StringTokenizer st = new StringTokenizer(query, " ");
			System.out.println("���� ������ : " + st.countTokens());
		}
		
	}
	
	public static void main(String[] args) {
		
		while (true) {
			System.out.print(">> ");
			String query = scan.nextLine();
			
			if(query.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				System.exit(0);
			}
			
			String[] a = query.split(" ");
			System.out.println("���� ������ " + a.length);
		}
	}
	
}
