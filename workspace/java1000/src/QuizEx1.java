// [����1] �־��� ���ڿ� �����͸� ������ �������� ���� ��µǵ��� �ڵ带 �ϼ��ϼ���.
// �������� ������ ����, ��, �������� ������ �Ǿ� ������ �����ڴ� `(����1���� Ű)�Դϴ�.

class QuizEx1 {
	public static void main(String[] args) {
		String[] data = { "���� �� Ű���尡 �ƴ� ����?`2`final`True`if`public", "���� �� �ڹ��� �����ڰ� �ƴ� ����?`5`&`|`++`!=`/`^",
				"���� �� �޼����� ��ȯ���� ������ �ǹ��ϴ� Ű�����?`1`void`null`false", };

		
		
//		String[] strArr = data[0].split("`");
//		System.out.println("[1] " + strArr[0]);
//		
//		for(int i=0; i<strArr.length; i++) {
//			System.out.println(strArr[i]);
//		}
//		
//		for(int j=2; j < strArr.length; j++) {
//			System.out.print("("+ (j-1) +")"+ strArr[j] + " ");
//		}
		
		
		for (int i = 0; i < data.length; i++) {

			// 1. StringŬ������ String[] split(String regex, int limit)�� ����ؼ� ������
			// �������� ��������.
			String[] strArr = data[i].split("`");
			
			// 2. ������ ����ϼ���.
			System.out.println("[" + (i+1) + "] " + strArr[0]);
			
			// 3. �������� ������ ���� String[] split(String regex)�� ����ϼ���.
			
			
			// 4.�ݺ����� �̿��ؼ� �������� ����ϼ���.
			for(int j=2; j < strArr.length; j++) {
				System.out.print( (j-1) +"."+ strArr[j] + " ");
			}
			
			System.out.println();

		}
	} // main
}
