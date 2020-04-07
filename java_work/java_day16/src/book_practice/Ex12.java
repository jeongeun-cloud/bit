package book_practice;

import java.util.Scanner;

public class Ex12 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("갬블링 게임에 참여할 선수 숫자 >> ");
		num = scan.nextInt();
		scan.nextLine();
		
		Person[] pArr = new Person[num];
		
		for(int i=0; i<num; i++) {
			Person p = new Person();
			System.out.printf("%d번째 선수 이름 >> ", i+1);
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
					System.out.println(pArr[i].getName() + " 님이 이겼습니다!");
					System.exit(0);
				} else {
					System.out.print("\t" + x +"\t" + y + "\t" + z);
					System.out.println(" 아쉽군요!");
				}
			}
		}
		
	}
}