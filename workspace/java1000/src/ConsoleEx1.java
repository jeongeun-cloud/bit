
// [����1] ������ �����ϸ� '>>'�� ���� ������Ʈ�� ��Ÿ���� ������� �Է��� ��ٸ���,
// ����ڰ� �Է��� ������ ȭ�鿡 ����Ѵ�. ���� ����ڰ� 'q' �Ǵ� 'Q'�� �Է��ϸ� ���α׷��� �����Ѵ�.
// ������ ������ �ϼ��ϼ���.

import java.util.*;

class ConsoleEx1 {
	public static void main(String[] args) {
		while(true) {
			String prompt = ">> ";
			System.out.print(prompt); 

			/*
                     ������ ���� ������ �ڵ带 ��������.                  
             1. ȭ�����κ��� ���δ����� �Է¹޴´�.  - java.util.ScannerŬ���� ���
             2. q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
			 */
			
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			
			if(str.equalsIgnoreCase("q")) {
				System.exit(0);
			}
			
			System.out.println(str);

		} // while(true)
	} // main
} // class
