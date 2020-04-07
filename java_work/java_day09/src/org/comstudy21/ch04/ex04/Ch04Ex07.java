package org.comstudy21.ch04.ex04;

import java.util.Arrays;

class Test {
	public void printArr(int[] arr) {	// �μ��� �´� Ÿ��, �Ű����� ����
		//System.out.println(Arrays.toString(arr)); // �׳� ����� �� 
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void printArr(int[][] arr) {	
		
		for(int i=0; i<arr.length; i++){
			System.out.print(Arrays.toString(arr[i]));
			System.out.println();
		}
	}
	
	
	public int[] joinArr(int[] arr1, int[] arr2) {
		
		int[] newArr = new int[arr1.length + arr2.length];
		
		int i=0;
		for(; i<arr1.length; i++){
			newArr[i] = arr1[i];
		}
		
		for(; i<newArr.length; i++){
			newArr[i] = arr2[i-arr1.length];
		}
		
		return newArr;
	}
	

	
// ���� ������ ���	
//	public int[][] mkArr(int[] ... arr2) {
//		
//		return arr2;
//	}
	
	
	public int[][] mkArr(int[] arr1, int[] arr2) {
		
		int[][] newArr = new int[2][];
		newArr[0] = arr1;
		newArr[1] = arr2;
		
		return newArr;
	}
	
}



public class Ch04Ex07 {

	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {60,70,80};
		
		Test test = new Test();
		test.printArr(arr1);
		
		int[] arr3 = test.joinArr(arr1, arr2); // �迭 2���� ���ڷ� �޾Ƽ� ����
		test.printArr(arr3);
		
		int[][] arr4 = test.mkArr(arr1, arr2);
		test.printArr(arr4);
		
	}
	
}
