package org.comstudy21.ch03;

public class Ch03Ex03 {
	
	public static void main(String[] args) {
		int[]scoreArr = null; // int 배열 타입의 참조변수
		int total = 0;
		double avg = 0;
		
		// 배열 타입의 참조변수는 배열만 참조한다.
		scoreArr = new int[]{85, 90, 75, 100, 95};
		
		// scoreArr 배열의 요소들의 합을 total에 저장하고
		// 평균을 avg에 저장해서 출력한다.
		for (int i=0; i<scoreArr.length; i++){
			total += scoreArr[i];
		}
		avg = total/scoreArr.length;
		
		System.out.printf("총점은 %d 입니다\n",total);
		System.out.printf("평균은 %.1f 입니다", avg);
	}

	
	
	public static void test(String[] args) {
		
		// 배열을 선언과 동시에 초기화한다(배열 리터럴 사용)
		int[] a = {85, 90, 75, 100, 95}; 
		
		// 리터럴은 초기화 할 때만 사용 가능. 따라서,
		// int a;
		// a = {85, 90, 75, 100, 95} 는 불가능
		
		// new 생성자 이용하면 가능
		// 생성 후 값 넣기 - 함수의 인자로 배열 리터럴을 사용할 때
		int[] y;
		y = new int[]{85, 90, 75, 100, 95};
		
		// main 함수의 매개변수는 배열이다.
		// main(new String[]{"kim","서울","프로그래머"});
		
		String[] strArr = {"kim","서울","프로그래머"};
		test(strArr);
		
	}

}
