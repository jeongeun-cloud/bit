package java_day07;

import java.util.Arrays;

public class Ch03Ex21 {

	public static void main(String[] args) {
		String[] metroArr = {"����","����","�뱸","�λ�","����","���","��õ"};
		
		System.out.println(metroArr[2]); // �뱸
		System.out.println(metroArr[4]); // ����
		
		int[] arr = new int[9];
		//  0,1,2,3,4,5,6,7,8
		// {1,2,3,0,0,0,4,5,6}
		int num = 1;
		for(int i=0; i<arr.length; i++){
			if(i<3 || i>5){
				arr[i] = num++;
			} else {
				arr[i] = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
