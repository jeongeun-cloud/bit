package book_practice;

import java.util.Scanner;

public class Page111 {
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ� >> ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		if(x>=100 && x<=200) {
			if(y>=100 && y<=200) {
				System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�.",x,y);
			} else {
				System.out.printf("(%d,%d)�� �簢�� �ȿ� �����ϴ�.",x,y);
			}
		} else {
			System.out.printf("(%d,%d)�� �簢�� �ȿ� �����ϴ�.",x,y);
		}
		
	}
		
	
	public static void Ex06(String[] args) {
		
		System.out.print("1-99 ������ ������ �Է��Ͻÿ� >> ");
		int num = scan.nextInt();
		int div = num/10; // 10,20,30,40,50,60,70,80,90
		int div2 = num%10; //03, 13, 23, 33, 43, 53, 63, 

		if(div2 == 3 | div2 == 6 |div2 == 9){
			if(div == 3 | div == 6 | div == 9) {
				System.out.println("�ڼ�¦¦");
			} else{
				System.out.println("�ڼ�¦");
			}
		}
	}
	
	
}
