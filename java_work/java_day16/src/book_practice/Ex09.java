package book_practice;

import java.util.Scanner;

public class Ex09 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		while(true) {
			System.out.print("ö�� [����(1), ����(2), ��(3), ������(4)] >> ");
			int user = scan.nextInt();
			int com = (int)(Math.random()*3 + 1);
			
			
			if(user == com) {
				System.out.println("�����ϴ�!");
			} else {
				switch(user){
				case 1 : 
					switch(com) {
					case 2 :
						System.out.println("ö��(����) : ��ǻ��(����)");
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
						break;
					case 3 : 
						System.out.println("ö��(����) : ��ǻ��(��)");
						System.out.println("ö���� �̰���ϴ�.");
						break;
					}
				break;
					
				case 2 : 
					switch(com) {
					case 1 :
						System.out.println("ö��(����) : ��ǻ��(����)");
						System.out.println("ö���� �̰���ϴ�.");
						break;
					case 3 : 
						System.out.println("ö��(����) : ��ǻ��(��)");
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
						break;
					}
				break;
				
				case 3 : 
					switch(com) {
					case 1 :
						System.out.println("ö��(��) : ��ǻ��(����)");
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
						break;
					case 2 : 
						System.out.println("ö��(��) : ��ǻ��(����)");
						System.out.println("ö���� �̰���ϴ�.");
						break;
					}
				break;
				
				case 4 : 
					System.out.println("���α׷� ����!");
					System.exit(0);
				}
	
			}
		}
		
	}
}