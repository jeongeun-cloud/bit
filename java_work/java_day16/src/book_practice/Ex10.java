package book_practice;

import java.util.Scanner;

public class Ex10 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("1��° ���� �̸� >> ");
		Person p = new Person();
		p.setName(scan.next());
		
		System.out.print("2��° ���� �̸� >> ");
		Person p2 = new Person();
		p2.setName(scan.next());
		scan.nextLine();

		while (true) {
			System.out.print("[" + p.getName() + "] : <Enter> ");
			scan.nextLine();
			int x = (int)(Math.random() * 3 + 1);
			int y = (int)(Math.random() * 3 + 1);
			int z = (int)(Math.random() * 3 + 1);
			
			if (x == y && y == z) {
				System.out.print("\t" + x +"\t" + y + "\t" + z);
				System.out.println(p.getName() + " ���� �̰���ϴ�!");
				break;
			} else {
				System.out.print("\t" + x +"\t" + y + "\t" + z);
				System.out.println(" �ƽ�����!");
			}
			
			System.out.print("[" + p2.getName() + "] : <Enter> ");
			scan.nextLine();
			x = (int)(Math.random() * 3 + 1);
			y = (int)(Math.random() * 3 + 1);
			z = (int)(Math.random() * 3 + 1);
			if (x == y && y == z) {
				System.out.print("\t" + x +"\t" + y + "\t" + z);
				System.out.println(p2.getName() + " ���� �̰���ϴ�!");
				break;
			} else {
				System.out.print("\t" + x +"\t" + y + "\t" + z);
				System.out.println(" �ƽ�����!");
			} 
		}
		
	}
}