package org.comstudy21.ch03;

public class Ch03Ex01 {

	public static void main(String[] args) {
		int[] a ; // int 배열 형의 참조 변수 선언	
		a = new int[5]; // 5개의 요소를 할당헸다	//두 줄 같이 쓰면 int[] a = new int[5];
		
		// 할당된 배열의 요소에 값을 대입한다.
		a[0] = 50;
		a[1] = 100;
		a[2] = 150;
		a[3] = 200;
		a[4] = 250;

//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
		// 첨자는 상수 대신 변수로 사용 가능 함
//		int i = 0;
//		System.out.println(a[i++]);
//		System.out.println(a[i++]);
//		System.out.println(a[i++]);
//		System.out.println(a[i++]);
//		System.out.println(a[i++]);
		
		for(int i=0; i<a.length; i++){
			System.out.printf("a[%d] => %d\n", i, a[i]);
		}
	}

}
