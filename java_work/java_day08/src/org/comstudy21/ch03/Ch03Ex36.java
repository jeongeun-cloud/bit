package org.comstudy21.ch03;

public class Ch03Ex36 {
	
	static int[] makeArray(int size) {
		int[] tempArr = new int[size];
		
		for(int i=0; i<tempArr.length; i++){
			tempArr[i] = (i*1)*100;
		}
		
		//return null; // 나중에 변수 지정해주면 return 변수명; 으로 꼭 고치기
		return tempArr; 
		
	}
	
	public static void main(String[] args) {	
		int[] intArray;
		
		intArray = makeArray(4);
		for(int i=0; i<intArray.length; i++){
			System.out.println(intArray[i]);
		}
	}
}
