import java.util.*;

// [����2] ����1���� �ϼ��� �ڵ忡 ����� �Է��� �޾Ƽ� ���俩�θ� �Ǵ��Ͽ� �������� ����������
// �������� ���� ����ϵ��� �ڵ带 �ϼ��ϼ���.

class QuizEx2 {
	public static void main(String[] args) {
		String[] data = { "���� �� Ű���尡 �ƴ� ����?`2`final`True`if`public", "���� �� �ڹ��� �����ڰ� �ƴ� ����?`6`&`|`++`!=`/`^",
				"���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?`1`void`null`false`", };

		Scanner s = new Scanner(System.in);
		int score = 0;

		for (int i = 0; i < data.length; i++) {
			String[] tmp = data[i].split("`", 3);

			String question = tmp[0];
			String answer = tmp[1];
			String[] choices = tmp[2].split("`");

			System.out.println("[" + (i + 1) + "] " + question);

			for (int x = 0; x < choices.length; x++) {
				System.out.print((x + 1) + "." + choices[x] + "\t");
			}
			System.out.println();

			/*
			 * 
			 * �˸��� �ڵ带 ��������.
			 * 
			 */
			System.out.print("[��] ");
			int num = s.nextInt();
			
			System.out.println();
			
			if(num == Integer.parseInt(answer)) {
				score++;
			}
		}

		// �˸��� �ڵ带 ��������.
		System.out.println("���䰳��/��ü���׼� : " + score +"/" + data.length);
		

	} // main
}
