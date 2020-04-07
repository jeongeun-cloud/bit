package java_day06;

import java.util.Scanner;

public class Day05Game {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		char yn = 'y'; // ����� ����
		do {
			int num = 0; // �ý����� ���� �߻� ���� �� ���̴�.
			int userNum = 0; // ����� �Է�
			int cnt = 5; // �õ� ���� Ƚ��
			int min = 1, max = 100; // �Է� ����
			
			// �ý����� ������ ����� �ش�.
			num = min + (int)Math.abs(Math.floor(Math.random()*max));
		//	System.out.printf("�ý����� ��ȣ�� �����߽��ϴ�. (��Ʈ : %d)\n", num);
			
			// cnt ��ŭ �ݺ��Ѵ�
			while (cnt > 0) {
				System.out.println("�ý����� ������ ��ȣ�� �����ּ���!");
				System.out.printf("����� �Է�(%d~%d����) : ", min , max );
				userNum = scan.nextInt();
				// ��ȿ�� �˻�
				while(!(userNum>=min && userNum<=max)){
					System.out.println("��� : ������ ��� ���� �ԷµǾ����ϴ�!");
					System.out.printf("�ٽ� �Է�(%d~%d����) : ", min , max );
					userNum = scan.nextInt();
				}
				
		//		System.out.println("����� ��ȣ �Է� ����!");
				
				if(userNum == num){
					System.out.println("���� �Դϴ�");
					break;
				} else if(userNum > num) {
					System.out.println("�ʹ� ū ���ڸ� �Է��߽��ϴ�");
					max = userNum - 1;
				} else if(userNum <num){
					System.out.println("�ʹ� ���� ���ڸ� �Է��߽��ϴ�");
					min = userNum + 1;
				}
				cnt --;
				System.out.println("(���� �õ� Ƚ�� : " + cnt);
			}
			
			if(cnt == 0){
				System.out.println("��ȸ�� ��� �����Ǿ� �ǰ� �߽��ϴ�");
			}
			
			System.out.print("������ �ٽ� �õ��Ͻðڽ��ϱ�? [y/n]");
			yn = scan.next().charAt(0);
			while(!(yn == 'y' || yn == 'n')){
				System.out.println("y�Ǵ� n�� �Է� �� �ּ���");
				System.out.print("������ �ٽ� �õ��Ͻðڽ��ϱ�? [y/n]");
				yn = scan.next().charAt(0);
			}
			
		}while(yn == 'y');
		
		System.out.println("���� ����! ������ �� ������~");
	}

}
