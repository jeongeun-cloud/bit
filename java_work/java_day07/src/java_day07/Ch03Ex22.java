package java_day07;

public class Ch03Ex22 {

	public static void main(String[] args) {
		int[] scoreArr = {95,80,100,65,60,70,90,95,100,30};
		int total = 0;
		
		// scoreArr�� 3��°���� 6��°������ ������ total�� ����
		for(int i=2; i<6; i++){
			total += scoreArr[i];
		}
		System.out.println(total);
		
	}

}
