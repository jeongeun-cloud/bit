package java_day07;

import java.util.Arrays;

public class Ch03Ex20 {
	public static void main(String[] args) {
		
		// 1���� �迭
		// �迭�� ���� ��Ҹ� �Ѳ����� ������ ���ӵ� ������ ���� �����̴�.
		// �ڹ��� �迭 �伭�� ���� Ÿ���̾���Ѵ�.
		// �迭 ��Ҵ� ÷�ڷ� �����ϰ� ����Ѵ�.
		// ù�� ° ����� index�� 0�̰�, ������ index�� n-1�̴�.
		// �迭�̸�[index]
		// index�� ���� ����� ���� ���� ��� ��밡���ϴ�.
		
		// �迭 ���� ��� 1 : ����� ���ÿ� �ʱ�ȭ
		String[] strArr = {"��¡��","�õα�","�뱸","����","�ź���"};
		String[] strArr2 = {"��¡��","�õα�","�뱸","����","�ź���"};
		
		// �迭 ���� ��� 2 : new�� �̿��� �� �迭 ����
		int[] intArr = new int[4];
		double[] doubleArr = new double[5];
		
		System.out.println(strArr[1]);	// �öѱ�
		//strArr[1] = "���";
		
		// Arrays.toString() - �μ��� ���� �迭�� ��Ұ��� ���ڿ��� ��ȯ
		System.out.println(Arrays.toString(strArr));
		
		System.out.println(Arrays.equals(strArr, strArr2));	

		//String[] strArr3 = new String[strArr.length];
		String[] strArr3 = Arrays.copyOf(strArr, strArr.length);
		System.out.println(Arrays.toString(strArr3));
	}
}
