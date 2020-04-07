package java_day07;

import java.util.Arrays;

public class Ch03Ex27 {
	public static void main(String[] args) {
		
		// 2차원 배열 다루기	// int [][] a = int[5][3]; //5행 3열
		int[][] arr = {
				{90,85,95},
				{95,75,95},
				{90,80,70},
				{80,90,60},
				{95,65,80}
		};
		
		// 출력 방식 1
		
//		for(int i=0; i<arr.length; i++){	// 이때 arr.length = 5, 행이 먼저이기 때문  
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		
		// 출력 방식 2
//		for(int[] ar : arr){
//			for(int num : ar) {
//				System.out.print(num + "\t");
//			}
//			System.out.println();
//		}
		
		// 출력 방식 3
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
