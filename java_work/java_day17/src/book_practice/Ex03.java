package book_practice;

import java.util.HashMap;
import java.util.Scanner;

public class Ex03 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���. (�� : Korea 5000)");
		
		while (true) {
			System.out.print("�����̸�, �α� >> ");
			String key = scan.next();
			if (key.equals("�׸�")) {
				break;
			} else {
				Integer value = scan.nextInt();
				nations.put(key, value);
			}			
		}
		
		while (true) {
			System.out.print("�α� �˻� >> ");
			String ppl = scan.next();
			
			if (ppl.equals("�׸�")) {
				System.exit(0);
			} else {
				if (nations.get(ppl) == null) {
					System.out.println(ppl + " ����� �����ϴ�.");
				} else {
					System.out.println(ppl + "�� �α��� " + nations.get(ppl));		
				}
			}
		}
	}

}