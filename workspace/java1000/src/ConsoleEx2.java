// [����2] ����ڰ� �Է��� ��ɶ����� ����(' ')�� �����ڷ� �ؼ� �߶� �迭�� ������ ������
// �迭�� ������ ����ϴ� ����. �ڵ带 �ϼ��ϼ���.

import java.util.*;

class ConsoleEx2 {
	static String[] argArr; // �Է��� �Ű������� ������� ���ڿ��迭

	public static void main(String[] args) {
		while (true) {
			String prompt = ">>";
			System.out.print(prompt);

			// ȭ�����κ��� ���δ����� �Է¹޴´�.
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();

			/*
			 * ������ �ڵ带 �ϼ��ϼ���.
			 * 
			 * 1. �Է¹��� ������ �յ� ������ �����Ѵ�. (StringŬ������ trim()���) 
			 * 2. �Է¹��� ��ɶ����� ������ ������ �����ڷ� �ؼ� ������ argArr�� ��´�.
			 * 		StringŬ������ split(String regex)�� ��� - ������ �ϳ� �̻��� ��쿡�� �ϳ��� �������� �����ؾ���
			 *		�������� ���Ǳ�� Ȯ���ϼ���.
			 */
			
			input = input.trim();
			argArr = input.split(" +");
			
			if (input.equalsIgnoreCase("Q")) { // q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
				System.exit(0);
			} else {
				for (int i = 0; i < argArr.length; i++) {
					System.out.println(argArr[i]);
				}
				/*
				 * ���� �ڵ带 ���� for������ �����ϸ� ������ ����. 
				 * for(String arg : argArr) {
				 * 		System.out.println(arg); 
				 * }
				 */
			}
		} // while(true)
	} // main
} // class
