package book_practice;

import java.util.Scanner;

public class Ex11 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print(">> ");
		StringBuffer str = new StringBuffer(scan.nextLine());
		
		while (true) {
			System.out.print("��� : ");
			String order = scan.nextLine();
			if (order.equals("�׸�")) {
				System.out.println("�����մϴ�");
				System.exit(0);
			}
			String[] s = order.split("!");
			if (str.indexOf(s[0]) == -1) {
				System.out.println("ã�� �� �����ϴ�!");
			} else {
				if (s[0].length() == 0 || s[1].length() == 1) {
					System.out.println("�߸��� ����Դϴ�!");
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