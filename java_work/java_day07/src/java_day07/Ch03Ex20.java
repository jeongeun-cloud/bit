package java_day07;

import java.util.Arrays;

public class Ch03Ex20 {
	public static void main(String[] args) {
		
		// 1차원 배열
		// 배열은 여러 요소를 한꺼번에 선언한 연속된 데이터 구조 형태이다.
		// 자바의 배열 요서는 같은 타입이어야한다.
		// 배열 요소는 첨자로 접근하고 사용한다.
		// 첫번 째 요소의 index는 0이고, 마지막 index는 n-1이다.
		// 배열이름[index]
		// index는 정수 상수나 정수 변수 모두 사용가능하다.
		
		// 배열 선언 방식 1 : 선언과 동시에 초기화
		String[] strArr = {"오징어","꼴두기","대구","명태","거북이"};
		String[] strArr2 = {"오징어","꼴두기","대구","명태","거북이"};
		
		// 배열 선언 방식 2 : new를 이용한 빈 배열 선언
		int[] intArr = new int[4];
		double[] doubleArr = new double[5];
		
		System.out.println(strArr[1]);	// 꼴뚜기
		//strArr[1] = "상어";
		
		// Arrays.toString() - 인수로 사용된 배열의 요소값이 문자열로 반환
		System.out.println(Arrays.toString(strArr));
		
		System.out.println(Arrays.equals(strArr, strArr2));	

		//String[] strArr3 = new String[strArr.length];
		String[] strArr3 = Arrays.copyOf(strArr, strArr.length);
		System.out.println(Arrays.toString(strArr3));
	}
}
