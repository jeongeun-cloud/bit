package book_practice;

import java.util.Scanner;

public class Ex12 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("���� ���ӿ� ������ ���� ���� >> ");
		num = scan.nextInt();
		scan.nextLine();
		
		Person[] pArr = new Person[num];
		
		for(int i=0; i<num; i++) {
			Person p = new Person();
			System.out.printf("%d��° ���� �̸� >> ", i+1);
			p.setName(scan.nextLine());
			pArr[i] = p;
		}
		
		while (true) {
			for(int i=0; i<num; i++) {
				System.out.print("[" + pArr[i].getName() + "] : <Enter> ");
				scan.nextLine();
				int x = (int)(Math.random() * 3 + 1);
				int y = (int)(Math.random() * 3 + 1);
				int z = (int)(Math.random() * 3 + 1);
				
				if (x == y && y == z) {
					System.out.print("\t" + x +"\t" + y + "\t" + z);
					System.out.println(pArr[i].getName() + " ���� �̰���ϴ�!");
					System.exit(0);
				} else {
					System.out.print("\t" + x +"\t" + y + "\t" + z);
					System.out.println(" �ƽ�����!");
				}
			}
		}
		
	}
}